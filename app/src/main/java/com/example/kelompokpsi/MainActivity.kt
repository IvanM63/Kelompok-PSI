package com.example.kelompokpsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kelompokpsi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var biodataList : MutableList<Biodata> = mutableListOf()
    private lateinit var recycleAdapter: RecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addData()
        recycleAdapter = RecycleAdapter(biodataList)
        binding.apply {
            recycleView.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = recycleAdapter
            }
        }


    }

    fun addData() {
        biodataList.add(Biodata(R.drawable.amogbob,"205150200111086","Ivan", "Bercocok Tanam", "Teknik Informatika - FILKOM UB"))
        biodataList.add(Biodata(R.drawable.amogbob,"205150200111086","Ivan", "Bercocok Tanam", "Teknik Informatika - FILKOM UB"))
        biodataList.add(Biodata(R.drawable.amogbob,"205150200111086","Ivan", "Bercocok Tanam", "Teknik Informatika - FILKOM UB"))
        biodataList.add(Biodata(R.drawable.amogbob,"205150200111086","Ivan", "Bercocok Tanam", "Teknik Informatika - FILKOM UB"))
        biodataList.add(Biodata(R.drawable.amogbob,"205150200111086","Ivan", "Bercocok Tanam", "Teknik Informatika - FILKOM UB"))
        biodataList.add(Biodata(R.drawable.amogbob,"205150200111086","Ivan", "Bercocok Tanam", "Teknik Informatika - FILKOM UB"))
        biodataList.add(Biodata(R.drawable.amogbob,"205150200111086","Ivan", "Bercocok Tanam", "Teknik Informatika - FILKOM UB"))
        biodataList.add(Biodata(R.drawable.amogbob,"205150200111086","Ivan", "Bercocok Tanam", "Teknik Informatika - FILKOM UB"))
        biodataList.add(Biodata(R.drawable.amogbob,"205150200111086","Ivan", "Bercocok Tanam", "Teknik Informatika - FILKOM UB"))

    }

}