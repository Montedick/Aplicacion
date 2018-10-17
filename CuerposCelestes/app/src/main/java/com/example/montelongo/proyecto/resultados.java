package com.example.montelongo.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class resultados extends AppCompatActivity implements View.OnClickListener {

    TextView TxtRes;
    ImageView IVRes;
    Button BtnRegresar,BtnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        TxtRes=(TextView)findViewById(R.id.TxtResultado);
        IVRes=(ImageView)findViewById(R.id.IVResultado);
        BtnSalir=(Button)findViewById(R.id.BtnSalir);
        BtnRegresar=(Button)findViewById(R.id.BtnRegresar);

        Bundle bundle= getIntent().getExtras();
        TxtRes.setText(bundle.getInt ("info")+"/3");
        if(bundle.getInt("info")>2){
            IVRes.setImageResource(R.drawable.bien);
        }else if(bundle.getInt("info")<2){
            IVRes.setImageResource(R.drawable.mal);
        }

        BtnSalir.setOnClickListener(this);
        BtnRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BtnRegresar:
                Intent intent = new Intent(resultados.this,Menu.class);
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
