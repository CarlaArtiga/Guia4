/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.guia4;

/**
 *
 * @author LENOVO
 */
public class Hamster extends Animal {
    private int CantPulgas;
    
    public Hamster(){
        
    }

    public Hamster(int CantPulgas) {
        this.CantPulgas = CantPulgas;
    }

    public Hamster(int CantPulgas, String Nombre, int Edad, String Alimento) {
        super(Nombre, Edad, Alimento);
        this.CantPulgas = CantPulgas;
    }

    public int getCantPulgas() {
        return CantPulgas;
    }

    public void setCantPulgas(int CantPulgas) {
        this.CantPulgas = CantPulgas;
    }
    
}
