/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.guia4;

/**
 *
 * @author LENOVO
 */
public class Animal {
    private String Nombre;
    private int Edad;
    private String Alimento;

    public Animal(){
        
    }
    public Animal(String Nombre, int Edad, String Alimento) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Alimento = Alimento;
    }

    public String getNombre() {
        return Nombre;
        
    }
    

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }
    
    
    
}
