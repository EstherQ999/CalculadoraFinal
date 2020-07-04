package com.example.calculadoraproyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numero = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "";



    private TextView solucion;
    private Button num_cero, num_uno, num_dos, num_tres, num_cuatro, num_cinco, num_seis, num_siete, num_ocho, num_nueve;
    private Button sumar, restar, dividir, multiplicar, igual, limpiar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solucion = findViewById(R.id.solucion);

        num_cero = findViewById(R.id.num_cero);

        num_uno = findViewById(R.id.num_uno);

        num_dos = findViewById(R.id.num_dos);

        num_tres = findViewById(R.id.num_tres);

        num_cuatro = findViewById(R.id.num_cuatro);

        num_cinco = findViewById(R.id.num_cinco);

        num_seis = findViewById(R.id.num_seis);

        num_siete = findViewById(R.id.num_siete);

        num_ocho = findViewById(R.id.num_ocho);

        num_nueve = findViewById(R.id.num_nueve);


        restar = findViewById(R.id.restar);

        sumar = findViewById(R.id.sumar);

        multiplicar = findViewById(R.id.multiplicar);

        dividir = findViewById(R.id.dividir);

        limpiar = findViewById(R.id.limpiar);

        igual = findViewById(R.id.igual);


        num_cero.setOnClickListener(this);
        num_uno.setOnClickListener(this);
        num_dos.setOnClickListener(this);
        num_tres.setOnClickListener(this);
        num_cuatro.setOnClickListener(this);
        num_cinco.setOnClickListener(this);
        num_seis.setOnClickListener(this);
        num_siete.setOnClickListener(this);
        num_ocho.setOnClickListener(this);
        num_nueve.setOnClickListener(this);

        restar.setOnClickListener(this);
        sumar.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        limpiar.setOnClickListener(this);
        igual.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.num_cero:
                numero = numero + "0";
                solucion.setText(numero);
                break;
            case R.id.num_uno:
                numero = numero + "1";
                solucion.setText(numero);
                break;
            case R.id.num_dos:
                numero = numero + "2";
                solucion.setText(numero);
                break;
            case R.id.num_tres:
                numero = numero + "3";
                solucion.setText(numero);
                break;
            case R.id.num_cuatro:
                numero = numero + "4";
                solucion.setText(numero);
                break;
            case R.id.num_cinco:
                numero = numero + "5";
                solucion.setText(numero);
                break;
            case R.id.num_seis:
                numero = numero + "6";
                solucion.setText(numero);
                break;
            case R.id.num_siete:
                numero = numero + "7";
                solucion.setText(numero);
                break;
            case R.id.num_ocho:
                numero = numero + "8";
                solucion.setText(numero);
                break;
            case R.id.num_nueve:
                numero = numero + "9";
                solucion.setText(numero);
                break;
            case R.id.restar:
                symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.sumar:
                symbol = "+";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.multiplicar:
                symbol = "x";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.dividir:
                symbol = "/";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.limpiar:
                symbol = "";
                numero = "";
                num1 = 0;
                num2 = 0;
                solucion.setText("");
                break;
            case R.id.igual:
                num2 = Integer.parseInt(numero);

                switch (symbol){
                    case "+":
                        solucion.setText("resultado " + (num1 + num2));
                        break;
                    case "-":
                        solucion.setText("resultado " + (num1 - num2));
                        break;
                    case "x":
                        solucion.setText("resultado " + (num1 * num2));
                        break;
                    case "/":
                        solucion.setText("resultado " + (num1 / num2));
                        break;
                }
                numero = "";
                num1 = 0;
                num2 = 0;


        }

    }
}