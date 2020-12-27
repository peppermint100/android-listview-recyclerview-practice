package com.example.listrecyclerviewpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listrecyclerviewpractice.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    lateinit var binding: ActivitySubBinding
    lateinit var recyclerViewAdapter: RecyclerViewAdapter

    private val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.toListViewButton.setOnClickListener{
            val intent = Intent(this@SubActivity, MainActivity::class.java)
            startActivity(intent)
        }

        val dataList = intent.getSerializableExtra("dataList") as ArrayList<DataModel>
        recyclerViewAdapter = RecyclerViewAdapter(dataList)

        Log.d(TAG, dataList.toString());

        binding.myRecyclerView.apply {
            layoutManager =LinearLayoutManager(this@SubActivity, LinearLayoutManager.VERTICAL, false)
            adapter = recyclerViewAdapter
        }
    }
}