package com.ovologos.tavlazar.Utils

import android.view.LayoutInflater
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty


class FragmentBinding<out T : ViewDataBinding>(
    @LayoutRes private var resId: Int,
) : ReadOnlyProperty<Fragment, T> {

    private var binding: T? = null

    override fun getValue(
        thisRef: Fragment,
        property: KProperty<*>,
    ): T = binding ?: createBinding(thisRef).also { binding = it }

    private fun createBinding(activity: Fragment): T =
        DataBindingUtil.inflate(LayoutInflater.from(activity.context), resId, null, true)
}

