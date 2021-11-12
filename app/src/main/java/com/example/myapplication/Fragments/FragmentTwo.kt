package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentTwoBinding

class FragmentTwo:Fragment() {
    lateinit var binding : FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTwoBinding.inflate(inflater)
        return  binding.root
//new
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.goToThird.setOnClickListener {
          parentFragmentManager.beginTransaction()
              .replace(R.id.fragmentsContainer, FragmentThree())
              .addToBackStack(null)
              .commit()
        }
    }
}