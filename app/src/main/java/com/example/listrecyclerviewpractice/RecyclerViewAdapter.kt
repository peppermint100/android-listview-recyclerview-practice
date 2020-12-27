package com.example.listrecyclerviewpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.listrecyclerviewpractice.databinding.CustomListBinding

class RecyclerViewAdapter(dataList: ArrayList<DataModel>): RecyclerView.Adapter<RecyclerViewHolder>() {

    var dataList: ArrayList<DataModel> = dataList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(CustomListBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun getItemCount() = this.dataList.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(this.dataList[position])

        holder.itemView.setOnClickListener {v ->
            Toast.makeText(v.context, this.dataList[position].name, Toast.LENGTH_SHORT).show()
        }
    }
}