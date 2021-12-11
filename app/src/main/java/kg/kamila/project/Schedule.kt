package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityProjectBinding
import kg.kamila.project.databinding.ActivityScheduleBinding

class Schedule : AppCompatActivity() {
    private lateinit var binding: ActivityScheduleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        binding= ActivityScheduleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.project.setOnClickListener{
            startActivity(Intent(this,Project::class.java))

            binding.plusButton.setOnClickListener{
                startActivity(Intent(this,New_task::class.java))

                binding.calendar.setOnClickListener{
                    startActivity(Intent(this,Calendar::class.java))
                }
            }
        }
    }
}