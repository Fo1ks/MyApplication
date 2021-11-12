package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.Fragments.FragmentOne
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentThreeBinding

class FragmentThree:Fragment() {
    lateinit var binding:FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThreeBinding.inflate(inflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.goToFirst.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentsContainer, FragmentOne())
                .addToBackStack(null)
                .commit()
        }
    }
}