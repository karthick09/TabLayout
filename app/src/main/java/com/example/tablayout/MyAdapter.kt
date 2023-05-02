package com.example.tablayout

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(context: Context, fm: FragmentManager, totalTabs: Int) :
    FragmentPagerAdapter(fm) {
    private val myContext: Context

    var count: Int

    init {
        myContext = context
        count = totalTabs
    }

    override fun getCount(): Int {
        return 0
    }


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                SportFragment()
            }
            2 -> {
                MovieFragment()
            }
            else -> HomeFragment()
        }
    }
}