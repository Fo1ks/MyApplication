package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentOneBinding

class FragmentOne: Fragment(){
lateinit var  binding:FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        binding = FragmentOneBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.goToSecond.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentsContainer, FragmentTwo())
                .addToBackStack(null)
                .commit()
        }

    }
}