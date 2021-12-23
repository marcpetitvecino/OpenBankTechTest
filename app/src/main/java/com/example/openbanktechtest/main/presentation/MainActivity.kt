package com.example.openbanktechtest.main.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.openbanktechtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingView: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingView.root)
    }
}