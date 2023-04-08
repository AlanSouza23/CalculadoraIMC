package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvresult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)

        val result = intent.getFloatExtra("Extra_Result", 0.1f)

        tvresult.text = result.toString()

        // Menor que 18.5 Abaixo do Peso
        // Entre 18.5 e 24.9 Normal
        // Entre 25.0 e 29.9 Sobrepeso I
        // Entre 30.0 e 39.9 Obesidade II
        // Maior que 40 Obesidade Grave III

    val classificacao = if (result < 18.5f)
        { "Abaixo do Peso"}
        else if(result in 18.5f..24.9f)
             { "Normal"}
        else if (result in 24.9f..29.9f)
             {"Sobrepeso"}
        else if (result in 30f..39.9f)
             {"Obesidade"}
        else
             {"Obesidade Grave"}

        tvClassificacao.text = getString(R.string.message_classificacao, classificacao)
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)

    }
}
