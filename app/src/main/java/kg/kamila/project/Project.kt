package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityProjectBinding

class Project : AppCompatActivity() {
    private lateinit var binding: ActivityProjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        binding= ActivityProjectBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.project.setOnClickListener{
            startActivity(Intent(this,Video::class.java))
        }

    }
}