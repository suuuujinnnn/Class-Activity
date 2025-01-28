package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//    private lateinit var clickMeButton: Button
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        clickMeButton = findViewById(R.id.button)
//
//        clickMeButton.setOnClickListener {
//            clickMeButton.text = "Button Clicked!"
//        }


//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//    findViewById(R.id.button).setOnClickListener {
//            clickMeButton.text = "Button Clicked!"
//        }
//
//    val ocl = object: OnClickLister {
//        override fun onClick(p0: View?) {
//            (p0 as Button).text = "Button Clicked!"
//        }
//    }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (findViewById<Button>(R.id.button)!!).setOnClickListener {
            (it as Button).text = "Button Clicked!"
        }
    }


}