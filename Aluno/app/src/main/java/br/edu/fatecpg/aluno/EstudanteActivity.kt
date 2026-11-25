package br.edu.fatecpg.aluno

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class EstudanteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_estudante)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txvTitulo = findViewById<TextView>(R.id.txv_titulo)
        val txvNome = findViewById<TextView>(R.id.txv_nome)
        val txvMatricula = findViewById<TextView>(R.id.txv_matricula)
        val btnBtn = findViewById<Button>(R.id.btn_gerar)
        txvNome.setText(intent.getStringExtra("nome_aluno"))
        btnBtn.setOnClickListener {
            val numMatricula = Random.nextInt(100)
            txvMatricula.setText(numMatricula.toString())
        }
    }
}