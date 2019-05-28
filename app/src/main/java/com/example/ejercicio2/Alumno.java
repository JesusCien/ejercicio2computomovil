package com.example.ejercicio2;

import android.content.Context;
import android.view.View;

import com.example.ejercicio2.R;

import java.io.Serializable;

public class Alumno implements Serializable {
    private int id;
    private String nombre;
    private String apellidos;
    private String cuenta;
    private String genero;
    private int image;
    private Context contexto;

    public Alumno(int id, String nombre, String apellidos, String cuenta, String genero, int image) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuenta = cuenta;
        this.genero = genero;
        this.image= image;
        //this.contexto = (Context) contexto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image){
        this.image = image;
    }
    public Context getContexto() {
        return contexto;
    }
    public void setContexto(Context contexto) {
        this.contexto = contexto;
    }

    @Override
    public String toString() {
        return contexto.getResources().getString(R.string.texto_nombre)
                + getNombre()
                + contexto.getResources().getString(R.string.texto_apellido)
                + getApellidos()
                + contexto.getResources().getString(R.string.texto_apellido)
                + getCuenta()
                + contexto.getResources().getString(R.string.texto_apellido)
                + getGenero()
                + contexto.getResources().getString(R.string.texto_apellido)
                + getImage();
    }
}
