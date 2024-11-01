package com.example;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList <Usuario> usuarios = new ArrayList<>();
    private ArrayList <PrestamoInterno> prestamosInternos = new ArrayList<>();
    private ArrayList <Articulo> articulos = new ArrayList<>();
    /*private ArrayList <Herramienta> herramientas = new ArrayList<>();
    private ArrayList <Juego> juegos = new ArrayList<>();
    private ArrayList <Mapa> mapas = new ArrayList<>();
    private ArrayList <Libro> libros = new ArrayList <>();
    
    //"así no"*/

    public Biblioteca ()
    {
        
    }

    //setter y getter
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<PrestamoInterno> getPrestamosInternos() {
        return prestamosInternos;
    }

    public void setPrestamosInternos(ArrayList<PrestamoInterno> prestamosInternos) {
        this.prestamosInternos = prestamosInternos;
    }

/*    public ArrayList<Herramienta> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(ArrayList<Herramienta> herramientas) {
        this.herramientas = herramientas;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public ArrayList<Mapa> getMapas() {
        return mapas;
    }

    public void setMapas(ArrayList<Mapa> mapas) {
        this.mapas = mapas;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public PrestamoInterno getPrestamoInterno() {
        return prestamoInterno;
    }

    public void setPrestamoInterno(PrestamoInterno prestamoInterno) {
        this.prestamoInterno = prestamoInterno;
    } 
    */

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

//de aca para abajo metodos especiales
//agregarArticulo, modificarArticulo, eliminarArticulo, mostrarArticulos

public void agregarArticulo (Articulo articulo)
{
    articulos.add (articulo);
}

public void eliminarArticulo (Articulo articulo)
{
    articulos.remove (articulo);
}

public void mostrarArticulos()
{
    for (Articulo art:articulos){
        art.mostrar();
    }
}

//agregar eliminar modificar prestamosInternos

public void agregarPrestamo (PrestamoInterno prestamo)
{
    prestamosInternos.add (prestamo);
}

public void eliminarPrestamo (PrestamoInterno prestamo)
{
    prestamosInternos.remove (prestamo);
}

public void mostrarPrestamos()
{
    for (PrestamoInterno pres:prestamosInternos){
        pres.mostrar();
    }   
}


/*public void modificarArticulo ()
{

/*esto lo hizo Juan
    public void agregar (Herramienta herramienta){
        herramientas.add(herramienta);
    }

    public void agregar (Juego juego){
        juegos.add(juego);
    }

    public void agregar (Articulo articulo){
        articulos.add(articulo);
    }

    public void mostrarAllArticulos(){
        for (Articulo art: articulos){
            art.mostrar();
        }
    }
        */
}
