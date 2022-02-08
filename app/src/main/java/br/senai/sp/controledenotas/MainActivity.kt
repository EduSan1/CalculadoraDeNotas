package br.senai.sp.controledenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)

        calcular.setOnClickListener() {
            val nota1 = findViewById<EditText>(R.id.numero1).text.toString().toInt()
            val nota2 = findViewById<EditText>(R.id.numero2).text.toString().toInt()
            val faltas = findViewById<EditText>(R.id.faltas).text.toString().toInt()
            val txtNota1 = findViewById<TextView>(R.id.txtNota1)
            val txtNota2 = findViewById<TextView>(R.id.txtNota2)
            val txtMedia = findViewById<TextView>(R.id.txtMedia)
            val txtFaltas = findViewById<TextView>(R.id.txtFaltas)
            val txtSituacao = findViewById<TextView>(R.id.txtSituacao)


            val media = (nota1 + nota2)/2
            txtNota1.text = "Nota 1: " + nota1
            txtNota2.text = "Nota 2: " + nota2
            txtMedia.text = "Média: " + media
            txtFaltas.text = "Faltas: " + faltas

            if (media >= 5) {

                txtSituacao.text = "Aprovado"
                txtSituacao.setTextColor(Color.GREEN)
            }else {

                txtSituacao.text = "Reprovado"
                txtSituacao.setTextColor(Color.RED)
            }


        }

        sair.setOnClickListener() {
            finish()
        }
    }
}