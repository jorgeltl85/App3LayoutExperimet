package com.sl2.app3layoutexperimet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout_calculadora);

        final TextView textoR = (TextView) findViewById(R.id.texto_resultado);

        Button b1 = (Button) findViewById(R.id.boton_1);
        Button b2 = (Button) findViewById(R.id.boton_2);
        Button b3 = (Button) findViewById(R.id.boton_3);
        Button b4 = (Button) findViewById(R.id.boton_4);
        Button b5 = (Button) findViewById(R.id.boton_5);
        Button b6 = (Button) findViewById(R.id.boton_6);
        Button b7 = (Button) findViewById(R.id.boton_7);
        Button b8 = (Button) findViewById(R.id.boton_8);
        Button b9 = (Button) findViewById(R.id.boton_9);

        Button bsumar = (Button) findViewById(R.id.boton_sumar);
        Button brestar = (Button) findViewById(R.id.boton_restar);
        Button bmultiplicar = (Button) findViewById(R.id.boton_multiplicar);
        Button bdividir = (Button) findViewById(R.id.boton_dividir);
        Button bcero = (Button) findViewById(R.id.boton_cero);
        Button bcoma = (Button) findViewById(R.id.boton_coma);
        Button bregresar = (Button) findViewById(R.id.boton_regresar);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        bsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        brestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        bmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        bdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });

        bcero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText("0");
            }
        });

        bcoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(",");
            }
        });

        bregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoR.setText(((Button)v).getText());
            }
        });


    }


}
