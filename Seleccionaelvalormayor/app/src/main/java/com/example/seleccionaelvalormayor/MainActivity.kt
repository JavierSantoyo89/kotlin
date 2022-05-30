package com.example.seleccionaelvalormayor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    // Declara valores globales //
    var puntos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // inicia funcion al terminar de cargar el diseño //
        generadorRandom()
    }
    fun generadorRandom(){

        // Se le asigna a cada variable " botonIzq/BotonDer" el valor de su respectivo id //
        var botonIzq = findViewById<Button>(R.id.btnInq)
        var botonDer = findViewById<Button>(R.id.btnDer)
        // botonIzq.text = "Jalo el izquierdo"
        // botonDer.text = "Jalo el derecho"

        // En la variable "r" guarda valores integer random //
        var r = Random()

        // En la variable "num1/num2" guarda valores integer random de valor maximo 100 //
        var num1 = r.nextInt(100)
        var num2 = r.nextInt(100)

        // Se asigna al BotonIzq el valor nuevo de la variable "num1" //
        botonIzq.text ="$num1"

        // Se asigna al BotonDer el valor nuevo de la variable "num2" //
        botonDer.text = "$num2"

        // Candado por si sale el mismo valor en ambos botones //
        if (num1 == num2){
            generadorRandom()
        }
    }
    fun botonIzquierdo(view: View){

        // Recupera el valor del boton //

        /*---------------------- Estructura para recuperar valores del front -----------------------
        Tipo de variable: val{Constante}, var{Variable}
        Nombre variable: botonIzq{Usa Camel case}
        FindViewById: Similar como se recupera valor en Javascript
        <>: Dentro se ingresa el objeto que buscas(Button, TextView,etc)
        (R.id.btinInq): En el "BtnInq cambialo por el valor del Id que quieres recuperar su valor
        -----------------------------------------------------------------------------------------*/

        var botonIzq = findViewById<Button>(R.id.btnInq)
        var botonDer = findViewById<Button>(R.id.btnDer)

        // Crea una variable donde recoge el valor del boton y lo convierte a integer //

        /*------------------ Estructura para convertir valor de boton a integer -------------------
        Nombre variable: botonIzq{Usa Camel case}
        botonIzq: Nombre de la variable asignada para el boton
        .text.toString().toInt(): Cadena necesaria para pasar de String a Integer
        -----------------------------------------------------------------------------------------*/
        var valIzq = botonIzq.text.toString().toInt()
        var valDer = botonDer.text.toString().toInt()

        // Operador If para validar que el "valIzq" sea mayor y asignar valor positivo //
        if (valIzq > valDer){
            //Gana punto
            puntos++
        }else{
            //Pierde punto
            puntos--
        }

        // Imprime en el textview el valor de la varable "puntos" //
        findViewById<TextView>(R.id.twPuntos).text = "Puntos: $puntos"

        // Funcion que genera valores random hasta el 100 //
        generadorRandom()
    }

    fun bottonDerecho(view: View){

        // Recupera el valor del boton //
        var botonIzq = findViewById<Button>(R.id.btnInq)
        var botonDer = findViewById<Button>(R.id.btnDer)

        // Crea una variable donde recoge el valor del boton y lo convierte a integer //
        var valIzq = botonIzq.text.toString().toInt()
        var valDer = botonDer.text.toString().toInt()

        // Operador If para validar que el "valDer" sea mayor y asignar valor positivo //
        if (valDer > valIzq){
            //Gana punto
            puntos++
        }else{
            //Pierde punto
            puntos--
        }

        // Imprime en el textview el valor de la varable "puntos" //
        findViewById<TextView>(R.id.twPuntos).text = "Puntos: $puntos"

        // Funcion que genera valores random hasta el 100 //
        generadorRandom()
    }}