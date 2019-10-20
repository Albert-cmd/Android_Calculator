package com.example.m8_activitat1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    float valor1 =0;
    float valor2 =0;
     boolean suma =false ;
     boolean resta=false;
     boolean multiplica=false;


     EditText EditText;

     Button b0, b1, b2, b3, b4, b5, b6,
            b7, b8, b9, bsuma, bmultiplica,
            bresta, besborra, bigual,bcoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        bsuma = (Button) findViewById(R.id.suma);
        bmultiplica = (Button) findViewById(R.id.multiplica);
        bresta = (Button) findViewById(R.id.resta);
        besborra = (Button) findViewById(R.id.esborra);
        bigual = (Button) findViewById(R.id.igual);
        bcoma = (Button) findViewById(R.id.coma);


        EditText = (EditText) findViewById(R.id.EditText);






             // METODES PROPIS PER CALCULAR


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "0");
            }
        });



        // METODOS OPERACIONES


        bsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (EditText == null) {
                    EditText.setText("");
                } else {
                    valor1 = Float.parseFloat(EditText.getText() + "");
                    suma = true;
                    EditText.setText(null);
                }
            }
        });

        bresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Float.parseFloat(EditText.getText() + "");
                resta = true;
                EditText.setText(null);
            }
        });

        bmultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Float.parseFloat(EditText.getText() + "");
                multiplica = true;
                EditText.setText(null);
            }
        });



        bigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor2 = Float.parseFloat(EditText.getText() + "");

                if (suma == true) {
                    EditText.setText(valor1 + valor2 + "");
                    suma = false;
                }

                if (resta == true) {
                    EditText.setText(valor1 - valor2 + "");
                    resta = false;
                }

                if (multiplica == true) {
                    EditText.setText(valor1 * valor2 + "");
                    multiplica = false;
                }


            }
        });

        besborra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText("");
            }
        });

        bcoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + ".");
            }
        });





    }
}
