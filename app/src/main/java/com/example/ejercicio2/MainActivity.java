package com.example.ejercicio2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOGTAG = "INFORMACIÓN";

    private Alumno alumno;
    private TextView tvTexto1;
    private Button btnBoton1;
    private Button btnBoton2;
    private Button btnBoton3;
    private EditText text;
    private EditText text2;
    private EditText text3;
    private Spinner genero;
    int sumadorid;
    String date2;
    String horoscopo;
    int dia,mess,mes,ano,resano,contador;
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    //private String[] names = getResources().getStringArray(R.array.genero_hombre);
    String[] names = {/*getResources().getString(R.string.genero_hombre)*/"Hombre", /*getResources().getString(R.string.genero_mujer)*/ "Mujer"};
    //public string alumnonombre;
    //Alumno tmpAlumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTexto1 = findViewById(R.id.tvTexto1);

        btnBoton1 = findViewById(R.id.btnBoton1); //enviar
        btnBoton2 = findViewById(R.id.btnBoton2); //limpiar
        btnBoton3 = findViewById(R.id.btnBoton3);//ver lista

        text = (EditText) findViewById(R.id.editnombre);
        text2 = (EditText) findViewById(R.id.editapellidos);
        text3 = (EditText) findViewById(R.id.editcuenta);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, names);

        genero = (Spinner) findViewById(R.id.spinnergenero);

        genero = (Spinner) findViewById(R.id.spinnergenero);


        genero.setAdapter(adapter);
        btnBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String nombrecom = text.getText().toString();
                String apellidoscom = text2.getText().toString();
                String cuentacom = text3.getText().toString();
                String generocom = genero.getSelectedItem().toString();

                sumadorid=sumadorid+1;
                if(generocom=="Men"||generocom=="Hombre") {
                    Alumno tmpAlumno = new Alumno(sumadorid, nombrecom, apellidoscom, cuentacom, generocom,R.drawable.estudiantehombre);
                    alumnos.add(tmpAlumno);
                }
                else{
                    Alumno tmpAlumno = new Alumno(sumadorid, nombrecom, apellidoscom, cuentacom, generocom,R.drawable.estudiantemujer);
                    alumnos.add(tmpAlumno);
                }

                Toast.makeText(getApplicationContext(), getResources().getString(R.string.letrero_enviar), Toast.LENGTH_SHORT).show();


            }
        });
        btnBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                text.setText("");
                text2.setText("");
                text3.setText("");
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.letrero_limpiar), Toast.LENGTH_SHORT).show();
                sumadorid=0;
            }
        });

        btnBoton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        intent.putExtra("datos",alumnos);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.letrero_verlista), Toast.LENGTH_SHORT).show();

            }
        });


        Log.d(LOGTAG, "dsdsdsds");



    }

}
