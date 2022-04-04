package com.example.lacknerfrag2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.lacknerfrag2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = FragOne()
        val secondFragment = FratTwo()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFrag, firstFragment)
            addToBackStack(null)
            commit()
        }

        binding.btnFragOne.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFrag, firstFragment)
                addToBackStack(null)
                commit()
            }

        }

        binding.btnFragTwo.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFrag, secondFragment)
                addToBackStack(null)
                commit()
            }
        }

    }


}