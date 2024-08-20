/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author Kim Villeda
 */
public abstract class Hospital {
  private String nombre;
    private int edad;
    private String cargo;

    public Hospital(String nombre, int edad, String cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
    }
    public abstract void realizarTrabajo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void mostrarInformacion() {
        System.out.println("Cargo: " + cargo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anos");
      
    }
}
    