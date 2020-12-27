package com.example.listrecyclerviewpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import com.example.listrecyclerviewpractice.databinding.ActivityMainBinding
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    var DataList: ArrayList<DataModel> = ArrayList<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        setContentView(R.layout.activity_main)

        for(i in 1..2000) {
            DataList.add(DataModel(R.drawable.ic_launcher_foreground, "$i 번"))
        }

        var myListView = findViewById<ListView>(R.id.my_list_view)
        myListView.adapter = CustomAdaptor(this, DataList)

        var toRecyclerViewButton = findViewById<Button>(R.id.to_recycler_view_button)

        toRecyclerViewButton.setOnClickListener{
            var intent = Intent(this@MainActivity, SubActivity::class.java)
            intent.putExtra("dataList", DataList as Serializable)
            startActivity(intent)
        }
    }
}