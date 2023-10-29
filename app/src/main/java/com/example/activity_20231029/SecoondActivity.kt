package com.example.activity_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.activity_20231029.databinding.ActivitySecoondBinding

class SecoondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecoondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_secoond)
        
        
        binding.btnFirstView.setOnClickListener { 
            
//            현재화면 종료: 밑에 깔린 이전 화면이 드러남
            finish()
//            Intent로 호출하면 안되는거냐? => Intent는 화면을 호출하는것 이므로 뒤로가기를 누르면 계속 추가된 화면이 나옴
//            즉 화면이 계속 쌓이는것임
            
        }
    }
}