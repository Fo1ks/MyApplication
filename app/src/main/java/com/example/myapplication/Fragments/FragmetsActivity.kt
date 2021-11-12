package com.example.myapplication.Fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityFragmetsBinding

class FragmetsActivity:AppCompatActivity() {
    lateinit var binding: ActivityFragmetsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmetsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()

            .replace(R.id.fragmentsContainer, FragmentOne())
            .addToBackStack(null)
            .commit()
    }
}
