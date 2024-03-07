package com.example.conversordemoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversordemoeda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.conversor.setOnClickListener{
            val dolar = binding.Dolar.text.toString().toDouble()
            val real = dolar * 4.94

            binding.real.setText("Valor em reais: ${real}")
        }
    }
}