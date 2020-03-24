package a1824jj.jp.ac.aiit.viewmodel_ktx

import a1824jj.jp.ac.aiit.viewmodel_ktx.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.apply {
            textView.text = viewModel.getCurrentCount().toString()
            button.setOnClickListener {
                textView.text = viewModel.getUpdatedCount().toString()
            }
        }
    }
}
