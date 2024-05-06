// Programa:             Programa1B.java
// Nombre:               Brigham Heber Acevedo Martinez                                                     
// Fecha:                29-Septiembre-2022                      
// Descripción:          Programa que pide una palabra codificada de 5 letras, 
//                       decodifica letra a letra  sumando 30 a su codigo ascii 
//                       y despues imprime la palabra decodificada.                                                                               
package psp;
import java.util.Scanner;
public class Programa1B {
    public static void main(String[] args) {
//      instansiamos un objeto de la clase Scanner para que lea lo que el 
//      usuario escribe
        Scanner lector_consola = new Scanner(System.in);
        String palabraCodificada = "";
        int valor_entero = 0;
        char valor_char =0;
        System.out.println("Ingresa una palabra codificada de 5 letras: ");
        palabraCodificada = lector_consola.nextLine();
//        este if nos obligara a poner una palabra de 5 letras.
        if (palabraCodificada.length() == 5) {
//            crearemos un arreglo del tamaño de la
//            palabra codificada que ingrese el usuario
            char[] palabraDeCodificada = new char[palabraCodificada.length()];
//            creamos un for del tamaño de la palabra codificada ingresada
            for (int i = 0; i < palabraCodificada.length(); i++) {
//                con el charAt el programa tomara una letra, indicada por la 
//                varaible i, la cual el programa pondra en el arreglo en el 
//                lugar indicado igualmente con la variable i 
                palabraDeCodificada[i] = palabraCodificada.charAt(i);
//                el programa convertira la letra indicada por la variable i, 
//                la convertira en entero y la guardara en la variable 
//                valor_entero
                valor_entero = (int) palabraDeCodificada[i];
                valor_entero = valor_entero + 30;
//                el entero se convertira en char y se guardara en la variable
//                valor_char
                valor_char = (char) valor_entero;
//                despues se guardara en el arreglo, en el lugar indicado por
//                la variable i
                palabraDeCodificada[i] = valor_char;
            }
//            daremos un salto de linea e imprimiremos la palabra codificada
            System.out.println("\nPalabra codificada: " + palabraCodificada);
            System.out.print("Palabra decodificada: ");
//            ahora imprimiremos el arreglo con la palabra decodificada
            for (int i = 0; i < palabraCodificada.length(); i++) {
                System.out.print(palabraDeCodificada[i]);
            }
            System.out.println("");
        } else {
            System.out.println("La palabra debe de ser de 5 letras.");
        }
    }
}