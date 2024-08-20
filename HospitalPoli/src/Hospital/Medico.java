/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author Kim Villeda
 */
public class Medico extends Hospital {

    public Medico(String nombre, int edad, String cargo) {
        super(nombre, edad, "Primero");
    }

    

   
  public void realizarTrabajo() {
         mostrarInformacion();
        System.out.println("Examina a los pacientes.");
    }  
}
