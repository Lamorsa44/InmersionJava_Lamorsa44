package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Titulo {
    private String titulo;
    private String sinopsis;
    private int fechaLanzamiento;
    private double valoracion;
    private double duracion;
    private boolean incluidoBasico;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public boolean isIncluidoBasico() {
        return incluidoBasico;
    }

    public void setIncluidoBasico(boolean incluidoBasico) {
        this.incluidoBasico = incluidoBasico;
    }
// Goodbless
    abstract public void menu();

    public abstract void llenar();
}
