package com.rajdeep.kotlinfragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.rajdeep.kotlinfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            gotoFragment(FragmentOne())
        }
        binding.btn2.setOnClickListener {
            gotoFragment(FragmentTwo())
        }




    }

    private fun gotoFragment(fragment: Fragment){

        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmenContainer, fragment).commit()

    }
}