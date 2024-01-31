package com.harsh.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.harsh.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var arrayList = arrayListOf<String>("1","2","3","4","5")
    lateinit var adapter : ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList)
        binding.lv.adapter = adapter

        binding.btnFAB.setOnClickListener(){
            arrayList.add((arrayList.size+1).toString())
            adapter.notifyDataSetChanged()
        }


    }
}