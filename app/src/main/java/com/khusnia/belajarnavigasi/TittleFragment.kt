package com.khusnia.belajarnavigasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.khusnia.belajarnavigasi.databinding.FragmentTittleBinding

class TittleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil  .inflate<FragmentTittleBinding>(inflater,R.layout.fragment_tittle,container,false)
        binding.playButton.setOnClickListener { view : View -> view.findNavController()
            .navigate(R.id.action_titleFragment_to_gameFragment)
        }

        return binding.root
    }

}