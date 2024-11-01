package com.example;

public class Mapa extends Articulo {
    
    private String nombre;
    private String tipo;
    //region agregar
    private int cantidadDisponible;

    public Mapa ()
    {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    //de aca para abajo metodos especiales
    public void mostrar (){
        System.out.println("Mapa: " + nombre + ". Tipo: " + tipo + ". Cantidad actual: " + cantidadDisponible);
    }
}
