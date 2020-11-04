package com.example.biodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_lk ->
                    if (checked) {
                        jk_result.text = radio_lk.text.toString()
                    }
                R.id.radio_pr ->
                    if (checked) {
                        jk_result.text = radio_pr.text.toString()
                    }
            }
        }
    }

    fun simpanData(view: View) {

        main_layout.visibility = View.INVISIBLE
        second_layout.visibility = View.VISIBLE

        nama_result.text = et_nama.text.toString()
        nik_result.text = et_nik.text.toString()
        usia_result.text = et_usia.text.toString()

        alamat_result.text = et_alamat.text.toString()
        email_result.text = et_email.text.toString()
        asal_sekolah_result.text = et_asal_sekolah.text.toString()
        kompetensi_result.text = et_kompetensi.text.toString()

    }

    fun backMain(view: View) {

        second_layout.visibility = View.INVISIBLE
        main_layout.visibility = View.VISIBLE

    }


}