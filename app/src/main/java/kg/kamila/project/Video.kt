package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityProjectBinding
import kg.kamila.project.databinding.ActivityVideoBinding

class Video : AppCompatActivity() {
    private lateinit var binding: ActivityVideoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        binding= ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.profile.setOnClickListener{
            startActivity(Intent(this,Profile_achievements::class.java))

            binding.addVideo.setOnClickListener{
                startActivity(Intent(this,New_video::class.java))
            }
        }
    }
}