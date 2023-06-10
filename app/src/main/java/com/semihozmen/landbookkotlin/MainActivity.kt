package com.semihozmen.landbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.semihozmen.landbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landList: ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        landList = ArrayList()

        val kizKulesi = LandMark("Kız Kulesi","İstanbul",R.drawable.kizkulesi)
        val cami = LandMark("Cami","İstanbul",R.drawable.istanbul)
        landList.add(kizKulesi)
        landList.add(cami)

        binding.rv.layoutManager = LinearLayoutManager(this)
        val adapter = LandMarkAdapter(landList)
        binding.rv.adapter = adapter

    }
}