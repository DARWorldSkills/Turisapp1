package com.davidpopayan.sena.quindioturisticobogota;

public class Sitio {
    //Declaración de variables para la clase Sitio
    private int imagen;
    private String nombre;
    private String descripcionc;
    private String ubicacion;
    private String descripcion;
    private float latitud;
    private float logitud;
    private String lugar;

    //Constructor vacio
    public Sitio() {
    }

    //Constructor para la clase Sitio con sus variables

    public Sitio(int imagen, String nombre, String descripcionc, String ubicacion, String descripcion, float latitud, float logitud, String lugar) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcionc = descripcionc;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.logitud = logitud;
        this.lugar = lugar;
    }


    //Encasulamiento de variables de la Clase Sitio

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionc() {
        return descripcionc;
    }

    public void setDescripcionc(String descripcionc) {
        this.descripcionc = descripcionc;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLogitud() {
        return logitud;
    }

    public void setLogitud(float logitud) {
        this.logitud = logitud;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
