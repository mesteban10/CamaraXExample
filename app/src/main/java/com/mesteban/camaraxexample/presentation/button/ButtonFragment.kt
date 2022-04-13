package com.mesteban.camaraxexample.presentation.button

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mesteban.camaraxexample.databinding.FragmentButtonBinding


class ButtonFragment : Fragment() {

    private lateinit var binding: FragmentButtonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonBinding.inflate(layoutInflater, container, false)
        showCameraFragment()
        return binding.root
    }

    private fun showCameraFragment() {
        binding.actionCamera.setOnClickListener {
            findNavController().navigate(
                ButtonFragmentDirections.goToCamera()
            )
        }
    }
}