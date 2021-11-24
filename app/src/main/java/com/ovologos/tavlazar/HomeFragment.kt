package com.ovologos.tavlazar

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ovologos.tavlazar.Utils.FragmentBinding
import com.ovologos.tavlazar.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    private val binding by FragmentBinding<FragmentHomeBinding>(R.layout.fragment_home)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnRoll11.setOnClickListener {
            findNavController().navigate(R.id.oneDiceFragment)
            Log.e("ButtonClick", "Tıklandi")
        }
        binding.btnRoll22.setOnClickListener {
            findNavController().navigate(R.id.twoDiceFragment)
            Log.e("ButtonClick", "Tıklandi")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }
}