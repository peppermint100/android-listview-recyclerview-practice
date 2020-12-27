package com.example.listrecyclerviewpractice

import androidx.recyclerview.widget.RecyclerView
import com.example.listrecyclerviewpractice.databinding.CustomListBinding

class RecyclerViewHolder(binding: CustomListBinding):RecyclerView.ViewHolder(binding.root){

    private val listImageView = binding.listImageView
    private val listTextView = binding.listTextView

    fun bind(dataModel: DataModel){
        listTextView.text = dataModel.name
        listImageView.setImageResource(dataModel.profile)
    }
}
