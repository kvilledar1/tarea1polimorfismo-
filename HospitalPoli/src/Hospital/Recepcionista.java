/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author Kim Villeda
 */
public class Recepcionista extends Hospital {

    public Recepcionista(String nombre, int edad, String cargo) {
        super(nombre, edad, "Tercera");
    }

    
   
    @Override
    public void realizarTrabajo() {
        mostrarInformacion();
        System.out.println(" Brinda informacion a los pacientes.");
    }
}
