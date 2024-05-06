// Programa:             Programa3A.java
// Nombre:               Brigham Heber Acevedo Martinez                                                     
// Fecha:                12-Octubre-2022                      
// Descripción:          Programa que lee un archivo de texto y cuenta los 
//                       minutos totales de cada una de las fases y las 
//                       convierte en horas.
package psp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Programa3A {
    public static void main(String[] args) {  
//      objeto archivo  con la ruta del archivo a leer
        File archivoALeer = new File
        ("C:/Users/ing_h/OneDrive/Escritorio/"
                + "archivoss/HeberAcevedo_TimeLog_Programa2A.txt/");
//      llamamos al metodo para contar las lineas
        contarLineas(archivoALeer);
    }
//  este metodo leera el archivo y contara los minutos
    public static void contarLineas(File archivoALeer) {
        int minutosPlanning = 0;
        int minutosDesign = 0;
        int minutosCode = 0;
        int minutosCompile = 0;
        int minutosTest = 0;
        int minutosPostmortem = 0;
        int minutosTotales = 0;
        int horasTotales = 0;
        String[] arregloPalabras ;
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
//                  estos if junto con el metodo startsWith nos ayudaran a 
//                  que cada que linea de texto que empieze con la palabra 
//                  clave de la fase, el programa seleccione dicha linea
                    if (lineaLeida.startsWith("Planning")) {
//                      una vez seleccionada, el metodo split nos permitira
//                      separar las palabras, en este caso señalamos que las 
//                      palabras seran separadas por los espaacios, despues
//                      se guardaran en el arreglo arregloPalabras
                        arregloPalabras = lineaLeida.split(" ");
//                      seleccionamos la seguinda palabra del arreglo con [1]
//                      que son los numeros que necesitamos y la convertimos en  
//                      entero, ya que es un String, despues lo guardamos en la 
//                      variable de los minutos de su fase respectiva
                        minutosPlanning = minutosPlanning + 
                                Integer.parseInt(arregloPalabras[1]);
                    }else if(lineaLeida.startsWith("Design")){
                        arregloPalabras = lineaLeida.split(" ");
                        minutosDesign = minutosDesign + 
                                Integer.parseInt(arregloPalabras[1]);
                    }else if(lineaLeida.startsWith("Code")){
                        arregloPalabras = lineaLeida.split(" ");
                        minutosCode = minutosCode + 
                                Integer.parseInt(arregloPalabras[1]);
                    }else if(lineaLeida.startsWith("Compile")){
                        arregloPalabras = lineaLeida.split(" ");
                        minutosCompile = minutosCompile + 
                                Integer.parseInt(arregloPalabras[1]);
                    }else if(lineaLeida.startsWith("Test")){
                        arregloPalabras = lineaLeida.split(" ");
                        minutosTest = minutosTest + 
                                Integer.parseInt(arregloPalabras[1]);
                    }else if(lineaLeida.startsWith("Postmortem")){
                        arregloPalabras = lineaLeida.split(" ");
                        minutosPostmortem = minutosPostmortem + 
                                Integer.parseInt(arregloPalabras[1]);
                    }                         
                }
//              dividiremos los minutos de la fase entre 60 para saber cuantas
//              horas tenemos en esta fase, y lo guardaremos en horasTotales
                horasTotales = minutosPlanning/60;
//              despues usaremos el operador de resto (%) para saber cuantos 
//              minutos sobran al dividir estos entre 60, y asi guardarlos en
//              la variable minutosTotales
                minutosTotales = minutosPlanning%60;
//              despues imprimiremos el nombre de la fase, sus horas y minutos
//              en la forma de  hh:mm
                System.out.println("Planning " + 
                        horasTotales+":"+minutosTotales); 
                horasTotales = minutosDesign/60;
                minutosTotales = minutosDesign%60;
                System.out.println("Design " + horasTotales+":"+minutosTotales);
                horasTotales = minutosCode/60;
                minutosTotales = minutosCode%60;
                System.out.println("Code "+horasTotales+":"+minutosTotales);
                horasTotales = minutosCompile/60;
                minutosTotales = minutosCompile%60;
                System.out.println("Compile "+horasTotales+":"+minutosTotales);
                horasTotales = minutosTest/60;
                minutosTotales = minutosTest%60;
                System.out.println("Test "+horasTotales+":"+minutosTotales);
                horasTotales = minutosPostmortem/60;
                minutosTotales = minutosPostmortem%60;
                System.out.println("Postmortem "+ 
                        horasTotales+":"+minutosTotales);
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