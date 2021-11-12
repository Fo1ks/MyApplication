package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity:AppCompatActivity(){
    private  lateinit var binding:ActivityMainBinding
    val startActivityForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == Activity.RESULT_OK) {
            it.data?.let { data ->
            binding.clickHere.text = data.getStringExtra("input")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var counter = 0
        binding.clickTo.setOnClickListener {
            binding.zero.text = (++counter).toString()
        }

        binding.clickHere.setOnClickListener {
                val intent = Intent(this, TwoActivity::class.java)
                .putExtra("counter", counter)
            startActivity(intent)
            startActivityForResult.launch(intent)

                 }
            }
        }


