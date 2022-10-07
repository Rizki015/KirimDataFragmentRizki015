package com.example.kirimdatakefragment_rizki015

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNim = findViewById<EditText>(R.id.etNim)
        val etNama = findViewById<EditText>(R.id.etNama)
        val spnProdi = findViewById<Spinner>(R.id.spnProdi)
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        val arrProdi = arrayOf("Teknik Informatika" , "Sistem Informasi" , "Bisnis Digital")
        val adpProdi = ArrayAdapter(
            this@MainActivity,
            android.R.layout.simple_spinner_dropdown_item,
            arrProdi
        )
        spnProdi.adapter = adpProdi

        btnKirim.setOnClickListener {
            val nim = "${etNim}"
            val nama = "${etNama}"
            val prodi = "${spnProdi.selectedItem}"

            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            val fragment = DataFragment()
            val b = Bundle()
            b.putString("nim", nim )
            b.putString("nama", nama )
            b.putString("prodi", prodi )
            fragment.arguments = b
            ft.replace(R.id.fragData, fragment ).commit()
        }

    }
}