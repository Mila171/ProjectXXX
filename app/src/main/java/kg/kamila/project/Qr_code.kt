package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityQrCodeBinding
import kg.kamila.project.databinding.ActivitySettingsBinding

class Qr_code : AppCompatActivity() {
    private lateinit var binding: ActivityQrCodeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_code)

        binding= ActivityQrCodeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.close.setOnClickListener{
            startActivity(Intent(this,Profile_achievements::class.java))
        }
    }
}