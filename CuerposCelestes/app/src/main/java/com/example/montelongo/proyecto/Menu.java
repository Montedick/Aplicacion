package com.example.montelongo.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button BtnDescripcion,BtnSatelites,BtnInstrumentos,BtnPlanetas,BtnMovimientos,BtnActividad,BtnVideos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BtnDescripcion=(Button)findViewById(R.id.BTNDescripcion);
        BtnSatelites=(Button)findViewById(R.id.BTNSatelite);
        BtnInstrumentos=(Button)findViewById(R.id.BTNInstrumento);
        BtnPlanetas=(Button)findViewById(R.id.BTNPlanetas);
        BtnMovimientos=(Button)findViewById(R.id.BTNMovimiento);
        BtnActividad=(Button)findViewById(R.id.BTNActividad);
        BtnVideos=(Button)findViewById(R.id.BTNVideo);

        BtnDescripcion.setOnClickListener(this);
        BtnSatelites.setOnClickListener(this);
        BtnInstrumentos.setOnClickListener(this);
        BtnPlanetas.setOnClickListener(this);
        BtnMovimientos.setOnClickListener(this);
        BtnActividad.setOnClickListener(this);
        BtnVideos.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //Descripcion
            case R.id.BTNDescripcion:
                Intent descripcion = new Intent(view.getContext(),descripcion.class);
                startActivity(descripcion);
                break;

            //Satelites y Asteroides
            case R.id.BTNSatelite:
                Intent SateliteyAsteroide = new Intent(view.getContext(),cuerposCelestes.class);
                startActivity(SateliteyAsteroide);
                break;

            //Instrumento para ver
            case R.id.BTNInstrumento:
                Intent intrumentos = new Intent(view.getContext(),intrumentos.class);
                startActivity(intrumentos);
                break;

            //Los 8 Planetas
            case R.id.BTNPlanetas:
                Intent planetas = new Intent(view.getContext(),planetas.class);
                startActivity(planetas);
                break;

            //Principales Movimientos
            case R.id.BTNMovimiento:
                Intent movimientos = new Intent(view.getContext(),movimientos.class);
                startActivity(movimientos);
                break;

            //Actividad
            case R.id.BTNActividad:
                Intent actividad = new Intent(view.getContext(),actividad.class);
                startActivity(actividad);
                break;
            //Video recreativo
            case R.id.BTNVideo:
                Intent video = new Intent(view.getContext(),video.class);
                startActivity(video);
                break;
        }
    }
}
