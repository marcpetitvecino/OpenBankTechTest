package com.example.openbanktechtest.main.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.openbanktechtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingView: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingView.root)
    }
}