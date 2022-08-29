/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.guia4;

/**
 *
 * @author LENOVO
 */
public class Perro extends Animal {
    private String ColorPelaje;

    public Perro(){
        
    }
    public Perro(String ColorPelaje) {
        this.ColorPelaje = ColorPelaje;
    }

    public Perro(String ColorPelaje, String Nombre, int Edad, String Alimento) {
        super(Nombre, Edad, Alimento);
        this.ColorPelaje = ColorPelaje;
    }

    public String getColorPelaje() {
        return ColorPelaje;
    }

    public void setColorPelaje(String ColorPelaje) {
        this.ColorPelaje = ColorPelaje;
    }
    
    
}
