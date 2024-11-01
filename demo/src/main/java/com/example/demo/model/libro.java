package com.example;

public class Libro extends Articulo 
{
    private String titulo;
    private String genero;
    private String autor;
    private String año;
    private int cantidadDisponible;

    public Libro ()
    {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    //de aca para abajo metodos especiales

    public void mostrar (){
        System.out.println(titulo + " " + autor + " " + genero);
    }
}
