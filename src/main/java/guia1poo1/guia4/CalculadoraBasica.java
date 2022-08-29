/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.guia4;

/**
 *
 * @author LENOVO
 */
public class CalculadoraBasica {
    private float num1;
    private float num2;
    private float suma;
    private float resta;
    private float multi;
    private float division;
    
    CalculadoraBasica(){
        
    }
    
    public float Sumar(int n1,int n2){
        this.num1 = n1;
        this.num2 = n2;
        suma = n1+n2;
       return suma;
    }
    public void ImprimirSuma(){
        System.out.println(suma);
    }
    public float Restar(int n1,int n2){
        this.num1 = n1;
        this.num2 = n2;
        resta = n1-n2;
        return resta;
    }
    public void ImprimirResta(){
        System.out.println(resta);
    }
    
    public float Multiplicar(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
        multi = n1*n2;
        return multi;
    }
    public void ImprimirMulti(){
        System.out.println(multi);
    }
    public float Dividir(int n1, int n2){
          this.num1 = n1;
          this.num2 = n2;
          division = n1/n2;
          return division;
          
    }
    public void ImprimirDiv(){
        if(this.num1<=0){
            System.out.println("Sintax Error");
        }
        else{
            System.out.print(division);  
        }
    }
    
    
    
}
