package com.porfaltadeiq.hemuerto.mouzom_u2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {


    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private TextView opMostrada;
    private TextView mostrar;
    private Button btnBorrar;
    private Button btnSumar;
    private Button btnIgual;
    private Button btnPts;

    private boolean sumamosOque = false;
    private float antesDeSimbolo;
    private float despuesDeSimbolo;


    private FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = findViewById(android.R.id.tabhost);
        tabHost.setup(this,
                getSupportFragmentManager(),android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Asteroides"),
                Tab1.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Constraint"),
                Tab2.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Botón"),
                Tab3.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator("Calculadora"),
                Tab4.class, null);


        btn0 = (Button)findViewById(R.id.numero0);
        btn1 = (Button)findViewById(R.id.numero1);
        btn2 = (Button)findViewById(R.id.numero2);
        btn3 = (Button)findViewById(R.id.numero3);
        btn4 =  (Button)findViewById(R.id.numero4);
        btn5 = (Button)findViewById(R.id.numero5);
        btn6 = (Button)findViewById(R.id.numero6);
        btn7 = (Button)findViewById(R.id.numero7);
        btn8 = (Button)findViewById(R.id.numero8);
        btn9 = (Button)findViewById(R.id.numero9);
        btnSumar = (Button)findViewById(R.id.botonSuma);
        btnIgual = (Button)findViewById(R.id.botonIgual);
        btnPts = (Button)findViewById(R.id.botonPesetas);



        /*btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = (EditText)opMostrada.getText();
                opMostrada.setText(mostrar.getText().toString() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mostrar = opMostrada.getText().toString();
                mostrar = mostrar + "1";
                opMostrada.setText(mostrar);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mostrar = opMostrada.getText().toString();
                mostrar = mostrar + "2";
                opMostrada.setText(mostrar);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mostrar = opMostrada.getText().toString();
                mostrar = mostrar + "3";
                opMostrada.setText(mostrar);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mostrar = opMostrada.getText().toString();
                mostrar = mostrar + "4";
                opMostrada.setText(mostrar);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mostrar = opMostrada.getText().toString();
                mostrar = mostrar + "5";
                opMostrada.setText(mostrar);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mostrar = opMostrada.getText().toString();
                mostrar = mostrar + "6";
                opMostrada.setText(mostrar);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mostrar = opMostrada.getText().toString();
                mostrar = mostrar + "7";
                opMostrada.setText(mostrar);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mostrar = opMostrada.getText().toString();
                mostrar = mostrar + "8";
                opMostrada.setText(mostrar);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mostrar = opMostrada.getText().toString();
                mostrar = mostrar + "9";
                opMostrada.setText(mostrar);
            }
        });*/




    }

    public void sePulsaPesetas(View view){
        btnPts = (Button)findViewById(R.id.botonPesetas);
        antesDeSimbolo = Float.parseFloat(opMostrada.getText().toString());
        borrar();
        antesDeSimbolo = antesDeSimbolo * 166;
        opMostrada.setText(String.valueOf(antesDeSimbolo));
    }

    public void sePulsaBtnCalculadora(View view){
        opMostrada = (TextView) findViewById(R.id.opMostrada);
        opMostrada.setText(opMostrada.getText()+(String)view.getTag());
    }

    public void sePulsaBorrar(View view){
        btnBorrar = (Button)findViewById(R.id.botonBorrar);
        //opMostrada.setText("");
        borrar();
    }

    public void sePulsaSumar(View view){
        btnSumar = (Button) findViewById(R.id.botonSuma);
        opMostrada = (TextView) findViewById(R.id.opMostrada);
        antesDeSimbolo = Float.parseFloat(opMostrada.getText().toString());
        sumamosOque = true;
        borrar();
    }

    public void borrar(){
        opMostrada.setText("");
    }

    public void sePulsaIgual(View view){
        btnIgual = (Button) findViewById(R.id.botonIgual);
        despuesDeSimbolo  = Float.parseFloat(opMostrada.getText().toString());
        borrar();
        igual();
    }


    public void igual(){
        float res;
        if (sumamosOque == true){
            res =  despuesDeSimbolo + antesDeSimbolo;
            opMostrada.setText(String.valueOf(res));
        }
    }



    public void sePulsa(View view){
        Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show();
    }


}