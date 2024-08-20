/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author Kim Villeda
 */


public class main {

    private static String jefe;
    private static String segunda;
    private static String tercera;

    public static void main(String[] args) {
        
        Hospital medico = new Medico("Dr Raul Villeda", 35, jefe);
        Hospital enfermera = new Enfermera(" Enfermera Rosales", 25, segunda);
        Hospital recepcionista = new Recepcionista (" senorita. Adria Lopez ", 18, tercera);

        // polimorfismo
        medico.realizarTrabajo();// llama al medico
        System.out.println();
        enfermera.realizarTrabajo(); // llama a enfermera
        System.out.println();
        recepcionista.realizarTrabajo();// llama a recepcionista
        
    }
}
