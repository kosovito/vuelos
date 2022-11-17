package com.kosovito.proyecto;

import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLLegada;
    private int nPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaLLegada, int nPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLLegada = fechaLLegada;
        this.nPasajeros = nPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(Date fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo: " + "nombre='" + nombre + '\'' + ", origen='" + origen + '\'' + ", destino='" + destino + '\'' +
                ", fechaLLegada=" + fechaLLegada + ", nPasajeros=" + nPasajeros;
    }
}
