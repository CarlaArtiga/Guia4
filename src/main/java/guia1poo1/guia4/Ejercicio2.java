/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.guia4;

/**
 *
 * @author LENOVO
 */
public class Ejercicio2 {
    
    static CalculadoraBasica cb = new CalculadoraBasica();
    static CalculadoraAvanzada av = new CalculadoraAvanzada();
     public static void main(String[] args) {
         cb.Sumar(15, 50);
         cb.ImprimirSuma();
         cb.Restar(50, 25);
         cb.ImprimirResta();
         cb.Multiplicar(12, 2);
         cb.ImprimirMulti();
         cb.Dividir(0, 5);
         cb.ImprimirDiv();
         av.Potencia(4, 3);
         av.ImprimirPotencia();
         av.Opuesto(4);
         av.ImprimirOpuesto();
         av.Factorial(5);
         av.ImprimirFactorial();
     }
}
