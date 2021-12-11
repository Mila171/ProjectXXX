package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityProfileAchievementsBinding
import kg.kamila.project.databinding.ActivityProjectBinding

class Profile_achievements : AppCompatActivity() {
    private lateinit var binding: ActivityProfileAchievementsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_achievements)

        binding= ActivityProfileAchievementsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.friend.setOnClickListener{
            startActivity(Intent(this,Profile_friends::class.java))

            binding.qrCode.setOnClickListener{
                startActivity(Intent(this,Qr_code::class.java))
            }
        }
    }
}