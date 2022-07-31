package com.dxy.customviewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dxy.customviewpager.databinding.FragmentHomeBinding
import com.dxy.customviewpager.databinding.FragmentSportBinding

class SportFragment : Fragment() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    arguments?.let {
    }
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val binding = FragmentSportBinding.inflate(inflater,container, false)

    return binding.root
  }

}