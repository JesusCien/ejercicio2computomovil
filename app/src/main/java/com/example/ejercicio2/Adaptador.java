package com.example.ejercicio2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejercicio2.Alumno;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context contexto;
    ArrayList<Alumno> alumnos;
    private String genero;
    private String edad;
    private String horoscopo;
    private static LayoutInflater inflater = null;


    public Adaptador(Context contexto, ArrayList<Alumno> alumnos) {

        this.contexto = contexto;
        this.alumnos = alumnos;
        this.genero= genero;
        this.edad=edad;
        this.horoscopo=horoscopo;
        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return alumnos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return alumnos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemento_lista,null);

        TextView tvNombreLista = vista.findViewById(R.id.tvnombre);
        TextView tvApellidoLista = vista.findViewById(R.id.tvapellido);
        TextView tvCuenta= vista.findViewById(R.id.tvcuenta);
        TextView tvGenero= vista.findViewById(R.id.tvgenero);
        ImageView ivImagenLista = vista.findViewById(R.id.ivImagenLista);

        tvNombreLista.setText(alumnos.get(position).getNombre());
        tvApellidoLista.setText(alumnos.get(position).getApellidos());
        tvCuenta.setText(alumnos.get(position).getCuenta());
        tvGenero.setText(alumnos.get(position).getGenero());
        ivImagenLista.setImageResource(alumnos.get(position).getImage());
        return vista;
    }

}