/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author Kim Villeda
 */
public class Enfermera extends Hospital{

    public Enfermera(String nombre, int edad, String cargo) {
        super(nombre, edad, "Segunda");
    }

    
    
    public void realizarTrabajo() {
        mostrarInformacion();
        System.out.println(" Cuida de los pacientes.");
    }
    
}
