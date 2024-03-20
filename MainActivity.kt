package com.depereza.verfuturonuevo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

                //cogemos los datos de la UI
            var btnEnviar : Button =findViewById<Button>(R.id.btnSend)
            var calendario:DatePicker =findViewById<DatePicker>(R.id.txtdatePicker)
        var txtNombre: EditText=findViewById(R.id.txtName)


        //programamos el boton
        btnEnviar.setOnClickListener {

            val dia= calendario.dayOfMonth      //creamos la variable de los días
            val mes= calendario.month+1   //creamos la variable de mes mas 1 ya que empieza en 0
            val ano= calendario.year  //creamos la variable de los años
val nombre=txtNombre.text

            //con Toast ponemos un aviso corto o largo depende de Lenght, en este aviso le decimos que seleccione las variables dia , mes, año
            Toast.makeText(this,"Fecha seleccionada : $dia/$mes/$ano",Toast.LENGTH_SHORT).show()

            // Para realizar el envío de información de una activity a la otra
            val intentFuturo = Intent(this, ActivityVerFuturo::class.java)  //para cambiar entre activity la activity que tiene el foco se lo da a la siguiente

// Añadir el nombre, el día y el mes de nacimiento como extras al Intent
            intentFuturo.putExtra("nombre", nombre.toString())  //si aparece el nombre en Rojo es porque falta crearlo en la recogida de datos de la UI
            intentFuturo.putExtra("dia", dia)
            intentFuturo.putExtra("mes", mes)
            startActivity(intentFuturo)
        }
    }

        }

