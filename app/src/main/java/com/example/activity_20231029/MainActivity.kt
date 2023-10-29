package com.example.activity_20231029

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.activity_20231029.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        //버튼이 눌리면 => secondAcitivity 로 화면 이동
        binding.btnMoveToSecond.setOnClickListener {

//            화면 이동시키기 : Intent클래스 활용

//            1, 어디서 출발해서 어디로 도착할지 정보 명시

            val  myIntent = Intent(this,SecoondActivity::class.java)

//            2, myIntent에 적힌대로 실제 화면으로 이동
            startActivity(myIntent)
        }

    }
}