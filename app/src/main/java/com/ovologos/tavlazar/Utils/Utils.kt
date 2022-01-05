package com.ovologos.tavlazar.Utils

import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import com.ovologos.tavlazar.R

fun roll(): Int {
    return (1..6).random()
}

fun DrawableSoruce(SourceInt: Int): Int {
    return when (SourceInt) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

}

