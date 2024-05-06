// Programa:             Programa2A.java
// Nombre:               Brigham Heber Acevedo Martinez                                                     
// Fecha:                05-Octubre-2022                      
// Descripción:          Programa que cuenta las lineas de codigo logicas 
//                       y los comentarios de un programa                      
package psp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Programa2A {
    public static void main(String[] args) {  
//      objeto archivo  con la ruta del archivo a leer
        File archivoALeer = new File
        ("C:/Users/ing_h/OneDrive/Escritorio/pael test/Programa1B.java/");
//      llamamos al metodo para contar las lineas
        contarLineas(archivoALeer);
    }
//  este metodo leera el archivo y contara las lineas
    public static void contarLineas(File archivoALeer) {
        int lineasTotales = 0;
        int lineasLogicas =0;
        int lineasComentarios=0;
//      abrimos un bloque de instrucciones try
        try{
//          este if nos condiciona que actuara solo si existe el archivo 
            if (archivoALeer.exists()) {
//                con bufferedreader procedemos a leerlo 
                BufferedReader lectorDeArchivo = 
                        new BufferedReader(new FileReader(archivoALeer));
                String lineaLeida;
//              mientras la linea leida no sea null, se leera
                while((lineaLeida = lectorDeArchivo.readLine()) != null){
//                  este if junto con el metodo startsWith nos ayudaran a 
//                  que cada que linea de codigo que empieze con los dos 
//                  guiones (//) significa que es un comentario, y no se
//                  contara como linea logica
                    if (lineaLeida.startsWith("//",0)) {
                        lineasComentarios = lineasComentarios+1;
                    }else{
                        lineasLogicas = lineasLogicas+1;
                    }                   
                }
                lineasTotales = lineasLogicas+lineasComentarios;
                System.out.println("Lineas logicas: "+lineasLogicas);
                System.out.println
                     ("lineas con comentarios: "+lineasComentarios);
                System.out.println("Lineas totales : "+lineasTotales);
//              cerramos o finalizamos la lectura
                lectorDeArchivo.close();
            }else{
                System.out.println("NO SE ENCONTRO EL ARCHIVO");
            }
//      en caso de haber una excepcion, le pediremos al programa que la
//      imprima para verla en la consola.
        }catch(Exception e){
            System.out.println(e.getMessage());
        }       
    }
 }