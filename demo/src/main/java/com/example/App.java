package com.example;

public final class App {
    private App() {
    }

    public static void main(String[] args)
    {
        Biblioteca biblioteca = new Biblioteca();
        
        //crear y setear usuarios
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.setNombreApellido("Laura");
        bibliotecario.setDni ("22.222.222");
        bibliotecario.setDireccion("Av siempre viva 456");
        bibliotecario.setTelefono("2474151515");

        Bibliotecario bibliotecario2 = new Bibliotecario();
        bibliotecario2.setNombreApellido("Daniela");
        bibliotecario2.setDni ("33.333.333");
        bibliotecario2.setDireccion("Av siempre viva 789");
        bibliotecario2.setTelefono("2474141414");
        
        Usuario profeJuan = new Usuario();
        profeJuan.setNombreApellido("Juan Castells");
        profeJuan.setDni("11.111.111");
        profeJuan.setDireccion("Av siempre viva 123");
        profeJuan.setTelefono("2474454545");

        //crear articulos:
        Herramienta regla = new Herramienta ();
        regla.setNombre("regla");
        regla.setCantidadDisponible(20);

        Mapa mapaBsas = new Mapa ();
        mapaBsas.setNombre("provincia BsAs");
        mapaBsas.setTipo("politico");
        mapaBsas.setCantidadDisponible(10);

        Juego monopoly = new Juego ();
        monopoly.setNombre("Monopoly");
        monopoly.setEdadRecomendada(10);
        monopoly.setGenero("Gestion de recursos");
        monopoly.setCantidadDisponible (5);

        //agregar articulos al Array
        biblioteca.agregarArticulo (regla);
        biblioteca.agregarArticulo (mapaBsas);
        biblioteca.agregarArticulo(monopoly);
        
        //mostrar articulos
        biblioteca.mostrarArticulos();

        //crear prestamoInterno
        PrestamoInterno prestamo1 = new PrestamoInterno (bibliotecario, regla, profeJuan);
        PrestamoInterno prestamo2 = new PrestamoInterno(bibliotecario2, monopoly, profeJuan);

        //agregar prestamoInterno
        biblioteca.agregarPrestamo(prestamo1);
        biblioteca.agregarPrestamo(prestamo2);

        //mostrar prestamo
        biblioteca.mostrarPrestamos();

        //eliminar prestamo
        biblioteca.eliminarPrestamo(prestamo1);

        biblioteca.mostrarPrestamos();

        String variable = "hola";
        while (variable == "hola") 
        { 
            System.out.print("Soy Lautaro y me la como toda todita, ");
            variable = "chau";
            System.out.print(variable);
        }
        



        /*esto lo hizo juan
        Persona p1 = new Persona("castells juan ", "35398727");
        p1.setDireccion("San Pablo 209");
        //System.out.println (p1.mostrarTodo());
        p1.mostrarTodo();

        Herramienta h1 = new Herramienta();
        Herramienta h2 = new Herramienta();

        biblioteca.agregar(monopoly);
        biblioteca.agregar(h2);

        Libro l1 = new Libro();
        l1.setAutor("Lechon Pomillo");
        l1.setTitulo("Boquita de Almendra");
        l1.setGenero("bailable");

        Mapa m2 = new Mapa();
        m2.setTipo("politico");
        m2.setNombre("Argentina");

        biblioteca.agregar(m2);
        biblioteca.agregar(l1);

        biblioteca.mostrarAllArticulos();
        */
    }
}
