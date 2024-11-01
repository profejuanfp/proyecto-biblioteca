package com.example;

public class Juego extends Articulo {
    
    private String nombre;
    private int edadRecomendada;
    private String genero;
    private int cantidadDisponible;

    public Juego ()
    {

    }
    
    public Juego (String nombre, int edadRecomendada, int cantidadDisponible, String genero)
    {
        this.nombre = nombre;
        this.edadRecomendada = edadRecomendada;
        this.cantidadDisponible = cantidadDisponible;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    //de aca para abajo metodos especiales
    
    public void mostrar ()
    {
        System.out.println("Juego: " + nombre + ". Edad recomendada: " + edadRecomendada + ". Género: " + genero + ". Cantidad actual: " + cantidadDisponible);
    }
}
