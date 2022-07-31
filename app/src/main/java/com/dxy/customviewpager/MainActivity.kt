package com.dxy.customviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dxy.customviewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {
  lateinit var binding : ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Home"))
    binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Sport"))
    binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Movie"))
    binding.tabLayout.tabGravity = TabLayout.GRAVITY_FILL

    val adapter = MyAdapter(this, supportFragmentManager, binding.tabLayout.tabCount)
    binding.viewPager.adapter = adapter

    binding.viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))

    binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
      override fun onTabSelected(tab: TabLayout.Tab) {
        binding.viewPager.currentItem = tab.position
      }
      override fun onTabUnselected(tab: TabLayout.Tab) {

      }
      override fun onTabReselected(tab: TabLayout.Tab) {

      }
    })

  }
}

