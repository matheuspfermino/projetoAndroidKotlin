package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BotaoAdicionar = findViewById<Button>(R.id.BotaoAdicionar)
        val NomeEdit = findViewById<EditText>(R.id.NomeeditText)
        val RAEdit = findViewById<EditText>(R.id.RAeditText)
        val EmailEdit = findViewById<EditText>(R.id.EmaileditText)
        val HorasEdit = findViewById<EditText>(R.id.HoraseditText)
        val TabelaEdit = findViewById<TableLayout>(R.id.tableLayout)


        BotaoAdicionar.setOnClickListener{
            val Nome = NomeEdit.text.toString()
            val RA = RAEdit.text.toString()
            val Email = EmailEdit.text.toString()
            val Horas = HorasEdit.text.toString()

            val tableRow = LayoutInflater.from(this).inflate(R.layout.table_row, null) as TableRow
            tableRow.findViewById<TextView>(R.id.NomeTextView).setText(Nome)
            tableRow.findViewById<TextView>(R.id.RATextView).setText(RA)
            tableRow.findViewById<TextView>(R.id.EmailTextView).setText(Email)
            tableRow.findViewById<TextView>(R.id.HorasTextView).setText(Horas)

            TabelaEdit.addView(tableRow)

            val removeButton = tableRow.findViewById<TableRow>(R.id.removeButton)

            removeButton.setOnClickListener {
                TabelaEdit.removeView(tableRow)
            }
        }

    }
}