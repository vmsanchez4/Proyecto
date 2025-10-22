package com.mycompany.practica;

/**
 *
 * @author MEGAPC
 */
public class Practica {

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Santiago","1752094001",17);
        estudiante1.mostrarInformacion();
        
        Profesor profesor1 = new Profesor();
        Profesor profesor2 = new Profesor("Carlos Gomez", "Matematicas", 40);
        Profesor profesor3 = new Profesor("Ana Perez", "Programacion", 35);

        System.out.println("Lista de Profesores");
        profesor1.mostrarDatos();
        profesor2.mostrarDatos();
        profesor3.mostrarDatos();

        System.out.println("Informacion del Vehiculo");
        Vehiculo vehiculo1 = new Vehiculo("Nissan Se", "Cafe", "ABC-1234");
        vehiculo1.mostrarDatos();
    }
}
