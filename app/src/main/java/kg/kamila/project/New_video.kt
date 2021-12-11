package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityNewTaskBinding
import kg.kamila.project.databinding.ActivityNewVideoBinding

class New_video : AppCompatActivity() {
    private lateinit var binding: ActivityNewVideoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_video)

        binding= ActivityNewVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.create.setOnClickListener{
            startActivity(Intent(this,Video::class.java))
        }
    }
}