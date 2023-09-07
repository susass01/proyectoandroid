package com.curso.android.app.practica.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity() : AppCompatActivity(), Parcelable {
    //Defino las variables

    lateinit var textouno: EditText
    lateinit var textodos: EditText
    lateinit var resultado: TextView

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            textouno= findViewById(R.id.textouno)
            textodos= findViewById(R.id.textouno)
            resultado=findViewById(R.id.resultado)


            }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    fun comparartexto (view: View){


            val t1 = textouno.getText().toString();
            val t2 = textodos.getText().toString();

        if (t1 == t2) {
            resultado.setText("Los textos son iguales")

        }else{
            resultado.setText("Los textos no son iguales")
    }
    }
