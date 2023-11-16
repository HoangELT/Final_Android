package tdtu.edu.vn.final_android.activity.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tdtu.edu.vn.final_android.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}