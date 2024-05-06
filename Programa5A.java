// Programa:             Programa5A.java
// Nombre:               Brigham Heber Acevedo Martinez                                                     
// Fecha:                16-Noviembre-2022                      
// Descripción:          Programa que pide ingresar o leer un enunciado y cuente 
//                       las veces en las que se repite un caracter o palabra
//                       que tambien se ingresara desde teclado.  
package psp;
import java.util.Scanner;
public class Programa5A {
//  A continuacion declaramos una variable estatica para que nos 
//  ayude a contar los caracteres   
    public static int contadorLetras(String caracterString, char caracterChar){
        int contadorCaracter = 0;
//      este for se activara al ser llamada la variable estatica,        
        for (int i=0; i<caracterString.length(); i++)
        {
//           revisara cada caracter en el string
            if (caracterString.charAt(i) == caracterChar)
            contadorCaracter++;
        }
        return contadorCaracter;
    }
    public static void main(String[] args) {
        Scanner lectorRespuesta = new Scanner(System.in);
        String fraseALeer;
        String objetoBuscado;
        char caracterBuscado;
        String palabrasMinusculas;
        String[] arregloPalabras;
        int contadorRepeticiones =0;
        System.out.println("Introduce un enunciado: ");
        fraseALeer=lectorRespuesta.nextLine();
        System.out.println("Introduce un caracter o palabra a buscar: ");
        objetoBuscado = lectorRespuesta.nextLine();
//      si el objeto buscado es menor a 2 entonces es un caracter
        if (objetoBuscado.length()<2) {
//          entonces con el metodo to lowercase convertimos todas las letras            
//          a minusculas             
            palabrasMinusculas= fraseALeer.toLowerCase();
//          despues las convertimos a char para que puedan ser separadas con             
//          el metodo char at
            caracterBuscado = objetoBuscado.charAt(0);
//          si solo fue un valor procedemos a leer:
            if (contadorLetras(palabrasMinusculas, caracterBuscado) < 2) {
                System.out.println("El caracter [" + caracterBuscado
                        + "] se encuentra una vez en el enunciado");
//          si fueron mas, entonces leemos:                
            } else {
                System.out.println("El caracter [" + caracterBuscado
                        + "] se encuentra "
                        + contadorLetras(palabrasMinusculas, caracterBuscado)
                        + " veces en el enunciado");
            }
//      si el objeto a buscar fue una palabra
        } else {
//          convertimos el enunciado a minusculas      
            palabrasMinusculas=fraseALeer.toLowerCase();
//          y separamos la frase con split  
            arregloPalabras = palabrasMinusculas.split(" ");
//          con el for each leemos palabra por palabra      
            for (String i : arregloPalabras) {
//              si alguna es igual a la palabra buscada, el contador aumentara 1
                if (i.equals(objetoBuscado)) {
                    contadorRepeticiones++;
                }
            }
            System.out.println("La palabra [" + objetoBuscado 
                    + "] se encuentra " + 
                    contadorRepeticiones + " veces en el enunciado.");
        }      
    }    
}