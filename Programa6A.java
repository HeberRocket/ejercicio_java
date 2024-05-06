// Programa:             Programa6A.java
// Nombre:               Brigham Heber Acevedo Martinez                                                     
// Fecha:                23-Noviembre-2022                      
// Descripción:          Un programa que incruste o anexe una palabra a una  
//                       cadena de caracteres e indicar después de que palabra.
package borradores;
import java.util.Scanner;
public class Programa6A {
//    con esta variables estatica podemos imprimir en mayuscula la primera 
//    letra de la frase    
    public static String convertirAMayuscula(String parametro){
        String stringAuxiliar= "";
        char letraUno =' ';
        char caracterSeleccionado= ' ';
        for (int i = 0; i < parametro.length(); i++) {
            letraUno=parametro.charAt(0);
            caracterSeleccionado=parametro.charAt(i);
            if (i==0) {
                caracterSeleccionado=Character.toUpperCase
                           (caracterSeleccionado);
            }
            stringAuxiliar+=caracterSeleccionado;
        }
        return stringAuxiliar;
    } 
    public static void main(String[] args)throws Exception{
        Scanner lectorRespuesta = new Scanner(System.in);
        String fraseALeer;
        String palabraAInsertar;
        String posicionInsertar;
        String resultante;
        System.out.println("Introduce un enunciado: ");
        fraseALeer = lectorRespuesta.nextLine();
        System.out.println("Ingresa una palabra a anexar al enunciado: ");
        palabraAInsertar = lectorRespuesta.nextLine();
//      le agregamos un espacio a la palabra  
        palabraAInsertar = " " + palabraAInsertar;
        fraseALeer = fraseALeer.toLowerCase();
        System.out.println("Ingresa la palabra donde se colocará la palabra: " 
                + palabraAInsertar);
        posicionInsertar = lectorRespuesta.nextLine();
//      insertamos con el metodo replace  
        resultante = fraseALeer.replace(posicionInsertar, posicionInsertar 
                + palabraAInsertar);
        System.out.println(convertirAMayuscula(resultante));
    }   
}
