package com.example.zurasapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.zurasapp.R

class HomeFragment: Fragment(R.layout.fragment_home){
    private lateinit var button:Button
    private lateinit var editText:EditText
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button = view.findViewById(R.id.button)
        editText = view.findViewById(R.id.editTextNumber)
        button.setOnClickListener {
            val age = editText.text.toString().toInt()
            val action = HomeFragmentDirections.actionHomeFragmentToNotificationFragment(age)
            findNavController().navigate(action)
        }
    }
}