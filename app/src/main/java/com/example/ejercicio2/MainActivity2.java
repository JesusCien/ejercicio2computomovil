package com.example.ejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity{
    //ArrayList<Alumno> alumnos = new ArrayList<>();
    Adaptador adaptador;
    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Alumno> alumnos = (ArrayList<Alumno> ) getIntent().getSerializableExtra("datos");

        adaptador = new Adaptador(this,alumnos);

        lv = findViewById(R.id.lv);

        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent1 = new Intent(view.getContext(),MainActivity3.class);

                String idcurso=Long.toString(id);

                Toast.makeText(getApplicationContext(), "id:"+idcurso, Toast.LENGTH_SHORT).show();


            }
        });

    }
}

