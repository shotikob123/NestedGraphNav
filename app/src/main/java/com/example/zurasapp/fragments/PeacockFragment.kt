package com.example.zurasapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.zurasapp.R

class PeacockFragment : Fragment(R.layout.fragment_peacock) {

    private lateinit var peacockButton : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        peacockButton = view.findViewById(R.id.peacockbttn)
        peacockButton.setOnClickListener {
            findNavController().navigate(R.id.nested_navgraph)

        }

    }



}
