package com.example.montelongo.proyecto;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class actividad extends AppCompatActivity implements View.OnClickListener{

    ImageView Imagen;
    Button BtnO1,BtnO2,BtnO3;
    int Correctas=0;

    //                     x        y        x
    String Pregunta1[]={"Tierra","Saturno","Jupiter"};
    String respuesta1[]={"Incorrecta","Correcta","Incorrecta"};
    int img1=R.mipmap.saturno6;
    //                    x         x        y
    String Pregunta2[]={"Pluton","Jupiter","Tierra"};
    String respuesta2[]={"Incorrecta","Incorrecta","Correcta"};
    int img2=R.mipmap.tierra3;
    //                    y         x       x
    String Pregunta3[]={"Neptuno","Venus","Marte"};
    String respuesta3[]={"Correcta","Incorrecta","Incorrecta"};
    int img3=R.mipmap.neptuno8;
    int variable=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad);
        Imagen=(ImageView)findViewById(R.id.IVPregunta);
        BtnO1=(Button)findViewById(R.id.BtnO1);
        BtnO2=(Button)findViewById(R.id.BtnO2);
        BtnO3=(Button)findViewById(R.id.BtnO3);

        BtnO1.setText(Pregunta1[0]);
        BtnO2.setText(Pregunta1[1]);
        BtnO3.setText(Pregunta1[2]);
        Imagen.setImageResource(img1);

        BtnO1.setOnClickListener(this);
        BtnO2.setOnClickListener(this);
        BtnO3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch(variable){
            case 0:
                if(view.getId()==BtnO2.getId()){
                    Toast.makeText(this,"Correcto",Toast.LENGTH_SHORT).show();
                    Correctas++;
                }
                BtnO1.setText(Pregunta2[0]);
                BtnO2.setText(Pregunta2[1]);
                BtnO3.setText(Pregunta2[2]);
                Imagen.setImageResource(img2);
                variable++;
                break;
            case 1:
                if(view.getId()==BtnO3.getId()){
                    Toast.makeText(this,"Correcto",Toast.LENGTH_SHORT).show();
                    Correctas++;
                }
                BtnO1.setText(Pregunta3[0]);
                BtnO2.setText(Pregunta3[1]);
                BtnO3.setText(Pregunta3[2]);
                Imagen.setImageResource(img3);
                variable++;
                break;
            case 2:
                if(view.getId()==BtnO1.getId()){
                    Toast.makeText(this,"Correcto",Toast.LENGTH_SHORT).show();
                    Correctas++;
                }
                //Enviar a al layout de resultado pasando los resultados
                Intent intent = new  Intent(actividad.this,resultados.class);
                intent.putExtra("info",Correctas);
                startActivity(intent);

                break;
        }
    }

}
