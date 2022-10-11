package coding.withze.workermanagertrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import coding.withze.workermanagertrial.databinding.ActivityBlurBinding

class BlurActivity : AppCompatActivity() {

    lateinit var binding: ActivityBlurBinding
    private val viewModel: BlurViewModel by viewModels { BlurViewModelFactory(application) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlurBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goButton.setOnClickListener {
            viewModel.applyBlur(1)
        }
    }
}