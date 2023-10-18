package com.example.mirecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mirecycler.adapter.RecyclerViewAdapter
import com.example.mirecycler.data.DataSource

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataSource: DataSource


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.idCourseRV)




        val layoutManager = GridLayoutManager(this, 2)



        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = RecyclerViewAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }





}
