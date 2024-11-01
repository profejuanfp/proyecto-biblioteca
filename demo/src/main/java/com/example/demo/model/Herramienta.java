package com.example;


public class Herramienta extends Articulo {
    
    private String nombre;
    private int cantidadDisponible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        System.out.println("Herramienta: " + nombre + ". Cantidad actual: " + cantidadDisponible);
    }
}