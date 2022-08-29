/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.guia4;

/**
 *
 * @author LENOVO
 */
public class Gato extends Animal{
    private String ColorOjos;
    
    public Gato(){
        
    }

    public Gato(String ColorOjos) {
        this.ColorOjos = ColorOjos;
    }

    public Gato(String ColorOjos, String Nombre, int Edad, String Alimento) {
        super(Nombre, Edad, Alimento);
        this.ColorOjos = ColorOjos;
    }

    public String getColorOjos() {
        return ColorOjos;
    }

    public void setColorOjos(String ColorOjos) {
        this.ColorOjos = ColorOjos;
    }
    
}
