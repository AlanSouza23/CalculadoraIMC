package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar UI component no arquivo Kotlin
        // Para recuperar esse botão preciso de uma ID do Componente

        //val btnCalcular: Button = findViewById<Button>(R.id.btnCalcular)

        // Colocar ação em um botão
        // Mover o Código que eu quero que ele execute para dentro do btnCalcular.setOnClickListener que nesse caso é o código
        //val altura: Float = 1.75f * 1.75f
        // val peso : Int = 60
        //val result = peso / altura
        // println(result)

        //btnCalcular.setOnClickListener {

        //val message: String = TextoMsg .text.toString()
        //val txtMsg: TextView = findViewById(R.id.txtMsg)

        /*val altura: Float = 1.75f * 1.75f
            val peso : Int = 60
            val result = peso / altura
            println(result)*/

        // Recuperar o que o usuário digitou aula 27, para recuperar uma View tenho que usar o findViewById e colocar em uma variavel
        // Para recuperar o txt que o usuário digitou devo fazer uma nova variavel dentro da btnCalcular.setOnClickListener

        //val edtmsg : EditText = findViewById(R.id.edtMsg)

        // Em Prática


        val btnCalcular: Button = findViewById<Button>(R.id.btnCalcular)
        val edtPeso: EditText = findViewById(R.id.edittextPeso)
        val edtAltura: EditText = findViewById(R.id.edtittext_altura)


        // btnCalcular.setOnClickListener {

        // Recuperei a mensagem do usuário
        // val message : String = edtPeso.text.toString()

        //Mostrando uma nova msg no TextView
        //TVResultado.text = message

        // Aula 28
        // EditText serve para capturar uma msg que o usuário digitou
        // TextViem serve para mostrar alguma imagem, texto para o usuário
        // Botão para aplicarmos uma ação
        // FindView serve para encontrar alguma View que está dentro da nossa setContentView(R.layout.activity_main)
        // Activity_main = XML

        btnCalcular.setOnClickListener {

            val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()

                if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty())

            {val altura: Float = alturaStr.toFloat()
                val peso: Float = pesoStr.toFloat()

                val alturaFinal: Float = altura * altura
                val result: Float = peso / alturaFinal



                // Para chamar a próxima tela e mostrar o resultado para o usuário devemos chamar uma itent aula 30
                // Chamamos ela para mostrar o resultado em outra tela
                // chamo a a função apply para dar acesso a própria itent que eu criei

                val intent = Intent(this, ResultActivity::class.java)
                    .apply { putExtra("Extra_Result", result)}

                startActivity(intent)}

            else {Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()}
        }
    }}