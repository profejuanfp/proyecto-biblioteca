package com.example;

public class Bibliotecario extends UsuarioP
{
    private String usuario;
    private String contraseña;
    private Biblioteca biblioteca;
    private Articulo articulo;
    

    //getter y setter

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
//de aca para abajo metodos especiales

//agregar articulo, modificar articulo, eliminar articulo

    public void agregarArticulo (Articulo articulo)
    {
        biblioteca.agregarArticulo(articulo);
    }

    public void eliminarArticulo ()
    {
        biblioteca.eliminarArticulo(articulo);
    }

    public void mostrarArticulos ()
    {
        biblioteca.mostrarArticulos();
    }

     //prestar, eliminar prestamo, modificar

    public void agregarPrestamo (PrestamoInterno prestamoInterno)
    {
        biblioteca.agregarPrestamo(prestamoInterno);
    }

    public void mostrarPrestamos ()
    {
        biblioteca.mostrarPrestamos();
    }

    public void eliminarPrestamo (PrestamoInterno prestamo)
    {
        biblioteca.eliminarPrestamo(prestamo);
    }

    public void agregarEtiqueta (Etiqueta etiqueta, Libro libro){
        libro.agregarEtiqueta(etiqueta);
    }
}
