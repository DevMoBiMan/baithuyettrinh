package com.example.saveandrestoreinstancestate

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val editText : EditText = findViewById(R.id.editTextText)
        val writedata = editText.text
        outState.putCharSequence("MySaveData", writedata)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val storedata = savedInstanceState.getCharSequence("MySaveData")
        val editText : EditText = findViewById(R.id.editTextText)
        editText.setText(storedata)
    }
}
