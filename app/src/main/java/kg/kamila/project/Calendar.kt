package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityCalendarBinding
import kg.kamila.project.databinding.ActivityProjectBinding

class Calendar : AppCompatActivity() {
    private lateinit var binding: ActivityCalendarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        binding= ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.left.setOnClickListener{
            startActivity(Intent(this,Schedule::class.java))
        }
    }
}