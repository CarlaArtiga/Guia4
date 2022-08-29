/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.guia4;

/**
 *
 * @author LENOVO
 */
public class CalculadoraAvanzada {
    private int num;
    private int potencia = 1;
    private int opuesto;
    private int factorial = 1;
    
    public CalculadoraAvanzada(){
        
    }
    public int Potencia(int n1, int p){
       for(int i=0;i<p;i++){
           potencia = potencia * n1;
       }
       return potencia;
    }
    public void ImprimirPotencia(){
        System.out.println(potencia);
        
    }
    public int Opuesto(int n){
        opuesto = n * (-1);
        return opuesto;
    }
    public void ImprimirOpuesto(){
        System.out.println(opuesto);
    }
    public int Factorial(int n){
        for(int i=n;i>0;i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public void ImprimirFactorial(){
        System.out.println(factorial);
    }
}
