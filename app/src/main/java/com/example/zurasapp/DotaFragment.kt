package com.example.zurasapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class DotaFragment : Fragment(R.layout.fragment_dota) {

    private lateinit var dotaButton : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dotaButton = view.findViewById(R.id.dotaButton)
        dotaButton.setOnClickListener {
            findNavController().navigate(R.id.action_dotaFragment_to_csgoFragment2)

        }

    }
}