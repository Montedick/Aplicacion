package com.example.montelongo.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class planetas extends AppCompatActivity implements View.OnClickListener{

    TextView TxtNombrePlaneta,TxtPeriodo,TxtAtmosfera;
    ImageView IVPlaneta;
    ImageButton IBPlaneta;
    int variable=1;
    String NombrePlaneta[]={"Mercurio","Venus","Tierra","Marte","Jupiter","Saturno","Urano","Neptuno"};
    String OrbitaPeriodo[]={"0,24","0,615","1,00","1,88","11,86","29,46","84,01","164,79"};
    String Atmosfera[]={"Trazas de hidrógeno y helio",
        "96 % CO2, 3 % nitrógeno,0.1 % agua","78 % nitrógeno, 21 % oxígeno, 1 % argón",
            "95 % CO2, 1.6 % argón, 3 % nitrógeno","90 % hidrógeno, 10 % helio, trazas de metano",
            "96 % hidrógeno, 3 % helio, 0.5 % metano","84 % hidrógeno, 14 % helio, 2 % metano",
            "74 % hidrógeno, 25 % helio, 1 % metano"};
    int ImgPLaneta[]={R.mipmap.mercurio1,R.mipmap.venus2,R.mipmap.tierra3,
    R.mipmap.marte4,R.mipmap.jupiter5,R.mipmap.saturno6,R.mipmap.urano7,R.mipmap.neptuno8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetas);

        TxtNombrePlaneta=(TextView)findViewById(R.id.TxtNomPlaneta);
        TxtAtmosfera=(TextView)findViewById(R.id.TxtAtmosfera);
        TxtPeriodo=(TextView)findViewById(R.id.TxtOrbitaPeriodo);
        IVPlaneta=(ImageView)findViewById(R.id.IVPlaneta);
        IBPlaneta=(ImageButton)findViewById(R.id.IBRefrescar);

        IVPlaneta.setImageResource(ImgPLaneta[0]);
        TxtNombrePlaneta.setText(TxtNombrePlaneta.getText()+": "+NombrePlaneta[0].toString()+"\n");
        TxtPeriodo.setText(TxtPeriodo.getText()+": "+OrbitaPeriodo[0].toString()+"\n");
        TxtAtmosfera.setText(TxtAtmosfera.getText()+": "+Atmosfera[0].toString()+"\n");
        IBPlaneta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (variable){
            case 1:
                //Planeta venus
                IVPlaneta.setImageResource(ImgPLaneta[1]);
                TxtNombrePlaneta.setText("Nombre Planeta: "+NombrePlaneta[1].toString()+"\n");
                TxtPeriodo.setText("Periodo orbital(años): "+OrbitaPeriodo[1].toString()+"\n");
                TxtAtmosfera.setText("Composición atmósfera: "+Atmosfera[1].toString()+"\n");
                variable++;
                break;
            case 2:
                //Planeta Tierra
                IVPlaneta.setImageResource(ImgPLaneta[2]);
                TxtNombrePlaneta.setText("Nombre Planeta: "+NombrePlaneta[2].toString()+"\n");
                TxtPeriodo.setText("Periodo orbital(años): "+OrbitaPeriodo[2].toString()+"\n");
                TxtAtmosfera.setText("Composición atmósfera: "+Atmosfera[2].toString()+"\n");
                variable++;
                break;
            case 3:
                //Planeta marte
                IVPlaneta.setImageResource(ImgPLaneta[3]);
                TxtNombrePlaneta.setText("Nombre Planeta: "+NombrePlaneta[3].toString()+"\n");
                TxtPeriodo.setText("Periodo orbital(años): "+OrbitaPeriodo[3].toString()+"\n");
                TxtAtmosfera.setText("Composición atmósfera: "+Atmosfera[3].toString()+"\n");
                variable++;
                break;
            case 4:
                //Planeta jupiter
                IVPlaneta.setImageResource(ImgPLaneta[4]);
                TxtNombrePlaneta.setText("Nombre Planeta: "+NombrePlaneta[4].toString()+"\n");
                TxtPeriodo.setText("Periodo orbital(años): "+OrbitaPeriodo[4].toString()+"\n");
                TxtAtmosfera.setText("Composición atmósfera: "+Atmosfera[4].toString()+"\n");
                variable++;
                break;
            case 5:
                //Planeta saturno
                IVPlaneta.setImageResource(ImgPLaneta[5]);
                TxtNombrePlaneta.setText("Nombre Planeta: "+NombrePlaneta[5].toString()+"\n");
                TxtPeriodo.setText("Periodo orbital(años): "+OrbitaPeriodo[5].toString()+"\n");
                TxtAtmosfera.setText("Composición atmósfera: "+Atmosfera[5].toString()+"\n");
                variable++;
                break;
            case 6:
                //Planeta urano
                IVPlaneta.setImageResource(ImgPLaneta[6]);
                TxtNombrePlaneta.setText("Nombre Planeta: "+NombrePlaneta[6].toString()+"\n");
                TxtPeriodo.setText("Periodo orbital(años): "+OrbitaPeriodo[6].toString()+"\n");
                TxtAtmosfera.setText("Composición atmósfera: "+Atmosfera[6].toString()+"\n");
                variable++;
                break;
            case 7:
                //Planeta neptuno
                IVPlaneta.setImageResource(ImgPLaneta[7]);
                TxtNombrePlaneta.setText("Nombre Planeta: "+NombrePlaneta[7].toString()+"\n");
                TxtPeriodo.setText("Periodo orbital(años): "+OrbitaPeriodo[7].toString()+"\n");
                TxtAtmosfera.setText("Composición atmósfera: "+Atmosfera[7].toString()+"\n");
                variable++;
                break;
            case 8:
                //Enviar a una tipo sub menu para salir o regresar
                Intent intentregresar= new Intent(planetas.this,Menu.class);
                startActivity(intentregresar);
                break;
        }

    }
}
