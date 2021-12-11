package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivitySettingsBinding
import kg.kamila.project.databinding.ActivityTaskBinding

class Settings : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        binding= ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.left.setOnClickListener{
            startActivity(Intent(this,Profile_achievements::class.java))
        }
    }
}