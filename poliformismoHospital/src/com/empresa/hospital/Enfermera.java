/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresa.hospital;

/**
 *
 * @author Kim Villeda
 */
public class Enfermera extends Empleado {

    public Enfermera(String nombre, int edad) {
        super(nombre, edad);
    }
    public void realizarTrabajo() {
        System.out.println("La enfermera" + getNombre()+ "  esta cuidado a los pacientes.");
    }
}
