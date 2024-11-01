package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrestamoInterno {

    private Usuario usuario;
    private Articulo articulo;
    private Bibliotecario bibliotecario;
    private String fecha;

    public PrestamoInterno ()
    {

    }

    public PrestamoInterno (Bibliotecario bibliotecario, Articulo articulo, Usuario usuario)
    {
        LocalDateTime fechaHoy = LocalDateTime.now(); //tomo la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //le doy formato
        this.fecha = fechaHoy.format(formato); //asigno la fechaformateada al atributo fecha

        this.bibliotecario = bibliotecario;
        this.articulo = articulo;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //de aca para abajo metodos especiales

    //mostrar
    public void mostrar ()
    {
        System.out.println("Bibliotecario: " + bibliotecario.getNombreApellido() + ". Usuario: " + usuario.getNombreApellido() + ". Articulo: " + articulo.getNombre() + ". Fecha:" + this.fecha);
    }
    
}
