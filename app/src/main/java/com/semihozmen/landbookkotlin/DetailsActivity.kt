package com.semihozmen.landbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.semihozmen.landbookkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val selectedLandMark = intent.getSerializableExtra("landmark") as LandMark

        binding.txtName.text = selectedLandMark.name
        binding.txtCountry.text = selectedLandMark.country
        binding.imgResim.setImageResource(selectedLandMark.img)


    }
}