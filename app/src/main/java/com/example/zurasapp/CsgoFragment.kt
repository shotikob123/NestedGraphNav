package com.example.zurasapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class CsgoFragment : Fragment(R.layout.fragment_csgo2) {


    private lateinit var csgoButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        csgoButton = view.findViewById(R.id.csgoButton)
        csgoButton.setOnClickListener {
            findNavController().navigate(R.id.action_csgoFragment2_to_dotaFragment)

        }

    }
}