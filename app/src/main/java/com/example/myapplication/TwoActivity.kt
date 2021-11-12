package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivitySecoundBinding


class TwoActivity :AppCompatActivity() {
    private lateinit var binding: ActivitySecoundBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecoundBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.zero1.text = intent.getIntExtra("counter",0).toString()


//binding.zero.text= intent.getIntExtra("counter",0).toString()
//        binding.zero1.text = intent.getIntExtra("counter",0).toString()

    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_OK, Intent().putExtra("input",binding.zero1.text.toString()))
        super.onBackPressed()
    }
}