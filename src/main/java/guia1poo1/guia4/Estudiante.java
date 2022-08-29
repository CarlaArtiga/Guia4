/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.guia4;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Estudiante {
    
    //Atributos para la clase Estudiante
    private String Nombre;
    private String Apellido;
    private int edad;
    private int carnet;
    private String[] Materias;
    private Scanner lector = new Scanner(System.in);
    
    
    //Constructor vacio para instanciar la clase
    public Estudiante() {

    }
    
    //Constructor con parametros, imprime los parametros y evalua si el estudiante es mayor de edad
    public Estudiante(String Nom, String Ape, int e, int c) {
        this.Nombre = Nom;
        this.Apellido = Ape;
        this.edad = e;
        this.carnet = c;

        System.out.println("Nombre: " + Nom);
        System.out.println("Apellido: " + Ape);
        System.out.println("Edad: " + e);
        System.out.println("Carnet: " + c);

        if (edad < 18) {
            System.out.println("Es menor de edad");
            System.exit(0);
        } else {
            System.out.println("Puede proseguir con la inscripcion");
        }

    }

    //Metodo para inscribir materias
    public void IngresarMaterias() {
        
        //Si alguno de los parametros esta vacio entonces no se procede con la inscripcion
        if (Nombre == "" || Apellido == "" || edad == 0 || carnet == 0) {
            System.out.println("Estudiante no encontrado");
            System.exit(0);
        } 
        else {
            //Se imprime nuevamente el nombre, apellido y carnet del estudiante
            int ContMat;
            System.out.println(" ");
            System.out.println("*************************");
            System.out.println("Nombre: " + this.Nombre);
            System.out.println("Apellido: " + this.Apellido);
            System.out.println("Apellido: " + this.carnet);

            //Se pide al usuario que ingrese la cantidad de materias a inscribir
            System.out.println(" ");
            System.out.print("Ingrese cantidad de materias a inscribir: ");
            ContMat = lector.nextInt();
            

            //Un estudiante solo puede inscribir 5 o menos materias.
            if (ContMat <= 5) {
                
                //Al array materias se le da el tamaño del contador de materias
                Materias = new String[ContMat];
                //Se recorre el array hasta ese contador
                for (int i = 0; i < this.Materias.length; i++) {
                    System.out.print("Ingrese materia " + (i + 1) + " : ");
                    Materias[i] = lector.next();

                }
            } 
            //Si el usuario quiere inscribir más de 5 materias, se da la siguiente notificacion
            else {
                System.out.println("Solo pruede ingresar 5 materias");
                System.exit(0);
            }

        }

    }

    //Metodo para mostrar datos del estudiante
    public void MostrarDatos() {
        //Se imprime el nombre, apellido y carnet del estudiante nuevamente
        System.out.println(" ");
        System.out.println("*************************");
        System.out.println("Estudiante: " + this.Nombre + " " + this.Apellido + " con carnet: " + this.carnet);
        System.out.println("ha inscrito: ");
        //Se imprime las materias inscritas del array
        for (int i = 0; i < Materias.length; i++) {
            System.out.println(Materias[i]);
        }
    }
}
