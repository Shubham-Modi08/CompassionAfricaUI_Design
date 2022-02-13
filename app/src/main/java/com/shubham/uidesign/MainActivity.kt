package com.shubham.uidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.shubham.uidesign.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_bar.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        view_pager.adapter = adapter
        TabLayoutMediator(tab_layout,view_pager){tab,position->
            when(position){
                0->{
                    tab.text = "Home Hub"
                }
                1->{
                    tab.text = "Sergio"
                }
                2->{
                    tab.text = "Emanuella"
                }
            }
        }.attach()
    }
}