// Programa:             Programa0A.java
// Nombre:               Brigham Heber Acevedo Martinez                                                       
// Fecha:                29-Septiembre-2022                      
// Descripción:          Programa que al ingresar tu edad te devuelva la misma 
//                       en meses y el año en que naciste.                                                                              
package proyects;
import java.util.Scanner;
public class Programa0A {
    public static void main(String[] args) {
//           instansiamos un objeto de la clase Scanner para que lea lo que el 
//           usuario escribe
        Scanner lector_consola = new Scanner(System.in);
        int edad_años = 0;
        int edad_meses = 0;
        int año_nacimiento = 0;
        System.out.println("Escribe tu edad: ");
//      cuando el usaurio ingrese su edad, el programa convertira su 
//      respuesta en un entero para poder usarlo como un valor numerico
        edad_años = Integer.parseInt(lector_consola.nextLine());
        edad_meses = edad_años * 12;
        año_nacimiento = 2022 - edad_años;
//      despues de hacer los calculos el programa imprimira los resultados.
        System.out.println("Tienes " + edad_meses + 
                " meses y naciste en el año " + año_nacimiento);
    }
}