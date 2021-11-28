package com.ovologos.tavlazar

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

        object : CountDownTimer(3000, 1000) {
            override fun onTick(p0: Long) {}
            override fun onFinish() {
                binding.splashFrameLayout.visibility = View.GONE
                binding.btnRoll11.visibility = View.VISIBLE
                binding.btnRoll22.visibility = View.VISIBLE

            }
        }.start()



        binding.btnRoll11.setOnClickListener {
            findNavController().navigate(R.id.oneDiceFragment)
            Log.e("ButtonClick", "Tıklandi")
        }
        binding.btnRoll22.setOnClickListener {
            findNavController().navigate(R.id.twoDiceFragment)
            Log.e("ButtonClick", "Tıklandi")
        }


    }




}