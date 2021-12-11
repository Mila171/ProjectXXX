package kg.kamila.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.project.databinding.ActivityNewTaskBinding
import kg.kamila.project.databinding.ActivityQrCodeBinding

class New_task : AppCompatActivity() {
    private lateinit var binding: ActivityNewTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_task)

        binding= ActivityNewTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.create.setOnClickListener{
            startActivity(Intent(this,Schedule::class.java))
        }
    }
}