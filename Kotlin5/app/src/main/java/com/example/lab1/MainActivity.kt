package com.example.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.View
import com.example.lab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            var resultValue: Int = binding.edVaelu.text.toString().toInt()
            var resultValue2: Int = binding.edVaelu2.text.toString().toInt()
            val fi = (resultValue2*resultValue2)+(resultValue*resultValue)


            if ( (resultValue >= 1) && (resultValue2 >= 1)) {
                binding.textView5.visibility = View.VISIBLE
                binding.textView5.text = fi.toString()
            } else {
                binding.textView5.visibility = View.VISIBLE
                binding.textView5.text = "Tousth."
            }

        }


        }


    }


