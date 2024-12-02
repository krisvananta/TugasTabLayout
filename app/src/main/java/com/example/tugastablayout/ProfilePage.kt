package com.example.tugastablayout

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugastablayout.databinding.ActivityProfilePageBinding

class ProfilePage : AppCompatActivity() {
    private val binding by lazy { ActivityProfilePageBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.namaProfile.text = binding.namaProfile.text.toString() + intent.getStringExtra("nama")
        binding.emailProfile.text = binding.emailProfile.text.toString() + intent.getStringExtra("email")
        binding.nomorProfile.text = binding.nomorProfile.text.toString() + intent.getStringExtra("nomor")
        binding.passwordProfile.text = binding.passwordProfile.text.toString() + intent.getStringExtra("password")

        binding.dashboard.setOnClickListener {
            val backToDashboard = Intent(this, DashboardPage::class.java)
            startActivity(backToDashboard)
        }
    }
}