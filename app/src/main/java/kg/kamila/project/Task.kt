package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityProjectBinding
import kg.kamila.project.databinding.ActivityTaskBinding

class Task : AppCompatActivity() {
    private lateinit var binding: ActivityTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        binding= ActivityTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.left.setOnClickListener{
            startActivity(Intent(this,Schedule::class.java))
        }

    }
}