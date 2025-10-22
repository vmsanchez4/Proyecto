/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

public class Vehiculo {
    String modelo;
    String color;
    String placa;

    public Vehiculo(String modelo, String color, String placa) {
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
    }

    public void mostrarDatos() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Placa: " + placa);
    }


}
