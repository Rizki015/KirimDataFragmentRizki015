package com.example.kirimdatakefragment_rizki015

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.*
import android.view.LayoutInflater
import android.widget.TextView


class DataFragment : Fragment() {
    override fun onCreateView(
        inflater : LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val v = inflater.inflate(R.layout.fragment_data, container ,false)
        val tvData = v.findViewById<TextView>(R.id.tvData)
        if (arguments != null) {
            val nim = requireArguments().getString("nim")
            val nama = requireArguments().getString("nama")
            val prodi = requireArguments().getString("prodi")
            tvData.text ="""
                NIM : $nim
                Nama : $nama
                Program studi : $prodi
            """.trimIndent()
        }
                return v

    }
}
