package com.ovologos.tavlazar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ovologos.tavlazar.Utils.DrawableSoruce
import com.ovologos.tavlazar.Utils.FragmentBinding
import com.ovologos.tavlazar.Utils.roll
import com.ovologos.tavlazar.databinding.FragmentTwoDiceBinding

class TwoDiceFragment : Fragment() {

    private val binding by FragmentBinding<FragmentTwoDiceBinding>(R.layout.fragment_two_dice)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnZarAt1.setOnClickListener {
            binding.imgvRolldice1.setImageResource(DrawableSoruce(roll()))
            binding.imgvRolldice2.setImageResource(DrawableSoruce(roll()))
        }
    }
}