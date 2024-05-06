// Programa:             Programa1A.java
// Nombre:               Brigham Heber Acevedo Martinez                                                     
// Fecha:                29-Septiembre-2022                      
// Descripción:          Programa que pide una palabra de 5 letras, codifica  
//                       cada letra para restarle 30 a su codigo ascii y 
//                       despues imprime la palabra codificada.              .                                                                              
package psp;
import java.util.Scanner;
public class Programa1A {
    public static void main(String[] args) {
//      instansiamos un objeto de la clase Scanner para que lea lo que el 
//      usuario escribe
        Scanner lector_consola = new Scanner(System.in);
        String palabraSinCodificar = "";
        int valor_entero = 0;
        char valor_char = 0;
        System.out.println("Ingresa una palabra de 5 letras: ");
        palabraSinCodificar = lector_consola.nextLine();
//      este if nos obligara a poner una palabra de 5 letras.
        if (palabraSinCodificar.length() == 5) {
//          crearemos un arreglo del tamaño de 
//          la palabra que ingrese el usuario
            char[] palabraCodificada = new char[palabraSinCodificar.length()];
//          creamos un for del tamaño de la palabra que el usuario ingrese
            for (int i = 0; i < palabraSinCodificar.length(); i++) {
//              el for nos dara una posicion, que el charAt identificara para 
//              seleccionar una letra de la palabra,y la guardara en la 
//              posicion en turno en el arreglo
                palabraCodificada[i] = palabraSinCodificar.charAt(i);
//              el arreglo dara la palabra en turno para convertirla en entero
//              y guardarla en la variable valor_entero
                valor_entero = (int) palabraCodificada[i];
                valor_entero = valor_entero - 30;
//              la palabra sera convertida a char y se guardara en la
//              variable valor_char
                valor_char = (char) valor_entero;
//              guardaremos la palabra ya codificada en el arreglo, en el 
//              lugar indicado con la letra i
                palabraCodificada[i] = valor_char;
            }
//          daremos un salto de linea e imprimiremos la palabra sin codificar
            System.out.println("\n" + palabraSinCodificar);
//          ahora imprimiremos el arreglo con la palabra codificada
            for (int i = 0; i < palabraSinCodificar.length(); i++) {
                System.out.print(palabraCodificada[i]);
            }
            System.out.println("");
        } else {
            System.out.println("La palabra debe de ser de 5 letras.");
        }
    }
}