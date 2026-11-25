package br.edu.fatecpg.aluno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txvAluno = findViewById<TextView>(R.id.txv_aluno)
        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val btnEnviar = findViewById<Button>(R.id.btn_Enviar)

        btnEnviar.setOnClickListener {
           val intent = Intent(this , EstudanteActivity::class.java)
            intent.putExtra("nome_aluno",edtNome.text.toString())
            startActivity(intent)
        }
    }
}