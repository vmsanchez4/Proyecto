/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author MEGAPC
 */
public class Estudiante {
    
    String nombre;
    String cedula;
    int edad;

    public Estudiante(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }
    
    
    public void mostrarInformacion(){
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es:" + edad);
        System.out.println("Su cedula es:" + cedula);
    }
    
}
