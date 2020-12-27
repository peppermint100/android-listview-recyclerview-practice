package com.example.listrecyclerviewpractice

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdaptor (val context: Context, val DataList: ArrayList<DataModel>): BaseAdapter() {
    private val TAG: String = "로그"

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        Log.d(TAG, "CustomAdaptor - getView() called");

        val data = DataList[position]

        val view: View = LayoutInflater.from(context).inflate(R.layout.custom_list, null)
        val profile = view.findViewById<ImageView>(R.id.list_image_view)
        val name = view.findViewById<TextView>(R.id.list_text_view)
        profile.setImageResource(data.profile)
        name.text = data.name
        return view
//        val binding = CustomListBinding.inflate(
//                LayoutInflater.from(parent?.context),
//                parent,
//                false
//        )
//
//        binding.listImageView.setImageResource(data.profile)
//        binding.listTextView.text = data.name
//        return binding.root
    }

    override fun getItem(position: Int): Any {
        return DataList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0L
    }

    override fun getCount(): Int {
        return DataList.size
    }

}