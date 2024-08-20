/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresa.hospital;

/**
 *
 * @author Kim Villeda
 */
public class main {
    public static void main(String[]args){
        Empleado medico = new Medico("Dr.Villeda",30);
        Empleado enfermera = new Enfermera("Enf. Rosales ",25);
   
    medico.realizarTrabajo();
    enfermera.realizarTrabajo();
    }
     
}
