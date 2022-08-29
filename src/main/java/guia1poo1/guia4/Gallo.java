/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.guia4;

/**
 *
 * @author LENOVO
 */

public class Gallo extends Animal {
    private String ColorPlumas;
    
    public Gallo(){
        
    }

    public Gallo(String ColorPlumas) {
        this.ColorPlumas = ColorPlumas;
    }

    public Gallo(String ColorPlumas, String Nombre, int Edad, String Alimento) {
        super(Nombre, Edad, Alimento);
        this.ColorPlumas = ColorPlumas;
    }

    public String getColorPlumas() {
        return ColorPlumas;
    }

    public void setColorPlumas(String ColorPlumas) {
        this.ColorPlumas = ColorPlumas;
    }
    
}
