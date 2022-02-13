package com.shubham.uidesign.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.shubham.uidesign.fragments.Emanuella
import com.shubham.uidesign.fragments.HomeHub
import com.shubham.uidesign.fragments.Sergio

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeHub()
            }
            1 -> {
                Sergio()
            }
            2 -> {
                Emanuella()
            }
            else -> {
                Fragment()
            }
        }
    }
}