package com.example.montelongo.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class descripcion extends AppCompatActivity implements View.OnClickListener {


    Button BtnRegresar,BtnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        BtnSalir=(Button)findViewById(R.id.BtnSalir);
        BtnRegresar=(Button)findViewById(R.id.BtnRegresar);
        BtnSalir.setOnClickListener(this);
        BtnRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BtnRegresar:
                Intent intent = new Intent(descripcion.this,Menu.class);
                startActivity(intent);
                break;
            case R.id.BtnSalir:
                Intent salir= new Intent(Intent.ACTION_MAIN);
                salir.addCategory(Intent.CATEGORY_HOME);
                salir.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(salir);
                break;

        }
    }
}
