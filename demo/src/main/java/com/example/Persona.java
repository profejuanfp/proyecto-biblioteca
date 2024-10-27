package com.example;

public class Persona {
    
    private String nombreApellido;
    private String dni;
    private String direccion;
    private String telefono;
    
    public Persona ()
    {
        
    }

    public Persona (String nombreApellido, String dni, String direccion, String telefono){
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }


//getter y setter

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
//de aca para abajo metodos especiales

    /*public String mostrarTodo (){
        String todo;
        todo = getDni() + "\n" + getNombreApellido() + "\n" + getDireccion();
        return todo;
    }*/

    public void mostrarTodo (){
        String todo;
        todo = getDni() + "\n" + getNombreApellido() + "\n" + getDireccion();
        System.out.println(todo);
    }
}
