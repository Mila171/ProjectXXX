
package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityProfileAchievementsBinding
import kg.kamila.project.databinding.ActivityProfileFriendsBinding

class Profile_friends : AppCompatActivity() {
    private lateinit var binding: ActivityProfileFriendsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_friends)

        binding= ActivityProfileFriendsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.achievements.setOnClickListener{
            startActivity(Intent(this,Profile_achievements::class.java))



        }
    }
}