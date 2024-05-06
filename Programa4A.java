// Programa:             Programa4A.java
// Nombre:               Brigham Heber Acevedo Martinez                                                     
// Fecha:                19-Octubre-2022                      
// Descripción:          Programa que lee un archivo de texto, contabiliza y 
//                       clasifica los tipos de defectos inyectados y removidos
//                       en un deffect log.
package psp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Programa4A {
    public static void main(String[] args) {  
//      objeto archivo  con la ruta del archivo a leer
        File archivoALeer = new File
        ("C:/Users/ing_h/OneDrive/Escritorio/"
                + "archivoss/HeberAcevedo_defect_log_Test2.txt/");
//      llamamos al metodo para contar las lineas
        contarLineas(archivoALeer);
    }
//  este metodo leera el archivo y contara los lineas
    public static void contarLineas(File archivoALeer) {
        int documentationCodeCompile = 0;
        int documentationDesignTest = 0;
        int syntaxCodeCompile = 0;
        int syntaxDesignTest = 0;
        int buildCodeCompile = 0;
        int buildDesignTest = 0;
        int assignamentCodeCompile = 0;
        int assignamentDesignTest = 0;
        int interfaceCodeCompile = 0;
        int interfaceDesignTest = 0;
        int checkingCodeCompile = 0;
        int checkingDesignTest = 0;
        int dataCodeCompile = 0;
        int dataDesignTest = 0;
        int functionCodeCompile = 0;
        int functionDesignTest = 0;
        int systemCodeCompile = 0;
        int systemDesignTest = 0;
        int environmentCodeCompile = 0;
        int environmentDesignTest = 0;
        String[] arregloPalabras;
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
//                  si la lina leida empieza con la palabra docuemtation
//                  sabremos que es un defecto de este tipo
                    if (lineaLeida.startsWith("Documentation")) {
//                  por lo tanto procedemos a partir las palabras y guardarlas
//                  en el arreglo, donde se dividiran mediante los espacios
                        arregloPalabras = lineaLeida.split(" ");
//                      una vez identificadas, usaremos la segunda palabra y si
//                      empieza con code, significa que fue un error inyectado 
//                      en code 
                        if (arregloPalabras[1].startsWith("Code")) {
//                      si fue error en code, lo correcto es que sea eliminado 
//                      en compile, por tanto aumentamos en 1 al contador para
//                      esta variable.
                            documentationCodeCompile = 
                                    documentationCodeCompile +1;
//                      si empieza con design, significa un error inyectado en 
//                      design y eliminado en testing.                            
                        }else if(arregloPalabras[1].startsWith("Design")){
//                      entonces aumentamos el contador para la variable
//                      que corresponde a esta accion
                            documentationDesignTest = documentationDesignTest+1;
                        }                       
                    }else if (lineaLeida.startsWith("Syntax")) {                     
                        arregloPalabras = lineaLeida.split(" ");
                        if (arregloPalabras[1].startsWith("Code")) {
                            syntaxCodeCompile = syntaxCodeCompile +1;
                        }else if(arregloPalabras[1].startsWith("Design")){
                            syntaxDesignTest = syntaxDesignTest+1;
                        }                       
                    }else if (lineaLeida.startsWith("Build")) {                      
                        arregloPalabras = lineaLeida.split(" ");
                        if (arregloPalabras[1].startsWith("Code")) {
                            buildCodeCompile = buildCodeCompile +1;
                        }else if(arregloPalabras[1].startsWith("Design")){
                            buildDesignTest = buildDesignTest+1;
                        }                     
                    }else if (lineaLeida.startsWith("Assignament")) {                     
                        arregloPalabras = lineaLeida.split(" ");
                        if (arregloPalabras[1].startsWith("Code")) {
                            assignamentCodeCompile = assignamentCodeCompile +1;
                        }else if(arregloPalabras[1].startsWith("Design")){
                            assignamentDesignTest = assignamentDesignTest+1;
                        }                       
                    }else if (lineaLeida.startsWith("Interface")) {                      
                        arregloPalabras = lineaLeida.split(" ");
                        if (arregloPalabras[1].startsWith("Code")) {
                            interfaceCodeCompile = interfaceCodeCompile +1;
                        }else if(arregloPalabras[1].startsWith("Design")){
                            interfaceDesignTest = interfaceDesignTest+1;
                        }                       
                    }else if (lineaLeida.startsWith("Checking")) {                      
                        arregloPalabras = lineaLeida.split(" ");
                        if (arregloPalabras[1].startsWith("Code")) {
                            checkingCodeCompile = checkingCodeCompile +1;
                        }else if(arregloPalabras[1].startsWith("Design")){
                            checkingDesignTest = checkingDesignTest+1;
                        }                       
                    }else if (lineaLeida.startsWith("Data")) {                      
                        arregloPalabras = lineaLeida.split(" ");
                        if (arregloPalabras[1].startsWith("Code")) {
                            dataCodeCompile = dataCodeCompile +1;
                        }else if(arregloPalabras[1].startsWith("Design")){
                            dataDesignTest = dataDesignTest+1;
                        }                       
                    }else if (lineaLeida.startsWith("Function")) {                     
                        arregloPalabras = lineaLeida.split(" ");
                        if (arregloPalabras[1].startsWith("Code")) {
                            functionCodeCompile = functionCodeCompile +1;
                        }else if(arregloPalabras[1].startsWith("Design")){
                            functionDesignTest = functionDesignTest+1;
                        }                     
                    }else if (lineaLeida.startsWith("System")) {                    
                        arregloPalabras = lineaLeida.split(" ");
                        if (arregloPalabras[1].startsWith("Code")) {
                            systemCodeCompile = systemCodeCompile +1;
                        }else if(arregloPalabras[1].startsWith("Design")){
                            systemDesignTest = systemDesignTest+1;
                        }
                    }else if (lineaLeida.startsWith("Environment")) {              
                        arregloPalabras = lineaLeida.split(" ");
                        if (arregloPalabras[1].startsWith("Code")) {
                            environmentCodeCompile = environmentCodeCompile +1;
                        }else if(arregloPalabras[1].startsWith("Design")){
                            environmentDesignTest = environmentDesignTest+1;
                        }
                    }
                }
//              si esta variable es mayor a 0 significa que ya se aumento
//              el contador de esta condicion
                if (documentationCodeCompile > 0) {
//                  por tanto vamos a imprimir los resultados, usando las 
//                  variables que contienen el numero de veces que se inyecto
//                  y removio un defecto
                    System.out.println
                               ("Defectos de tipo Documentation a la fecha: "
                               + documentationCodeCompile + 
                               " inyectados en Codificación y "
                               + "\nremovidos en Compilación.");
                }
                if (documentationDesignTest>0) {
                    System.out.println(
                            "Defectos de tipo Documentation a la fecha: "+
                            documentationDesignTest+" inyectados en Diseño y "
                             + "\nremovidos en Testing.");
                }
                if (syntaxCodeCompile>0) {
                    System.out.println
                                ("Defectos de tipo Syntax a la fecha: "+
                                 syntaxCodeCompile+
                                 " inyectados en Codificación y "
                                 + "\nremovidos en Compilación.");
                }
                if (syntaxDesignTest>0) {
                    System.out.println("Defectos de tipo Syntax a la fecha: "+
                            syntaxDesignTest+" inyectados en Diseño y "
                                    + "\nremovidos en Testing.");
                }
                if (buildCodeCompile>0) {
                    System.out.println("Defectos de tipo Build a la fecha: "+
                            buildCodeCompile+"  inyectados en Codificación y "
                                    + "\nremovidos en Compilación.");
                }
                if (buildDesignTest>0) {
                    System.out.println("Defectos de tipo Build a la fecha: "+
                            buildDesignTest+"  inyectados en Diseño y "
                                    + "\nremovidos en Testing.");
                }
                if (assignamentCodeCompile>0) {
                    System.out.println(
                        "Defectos de tipo Assignament a la fecha: "+
                        assignamentCodeCompile+" inyectados en Codificación y "
                                  + "\nremovidos en Compilación.");
                }
                if (assignamentDesignTest>0) {
                    System.out.println(
                            "Defectos de tipo Assignament a la fecha: "+
                            assignamentDesignTest+"  inyectados en Diseño y "
                                    + "\nremovidos en Testing.");
                }
                if (interfaceCodeCompile>0) {
                    System.out.println(
                          "Defectos de tipo Interface a la fecha: "+
                          interfaceCodeCompile+" inyectados en Codificación y "
                                  + "\nremovidos en Compilación.");
                }
                if (interfaceDesignTest>0) {
                    System.out.println(
                            "Defectos de tipo Interface a la fecha: "+
                            interfaceDesignTest+" inyectados en Diseño y "
                                    + "\nremovidos en Testing.");
                }
                if (checkingCodeCompile>0) {
                    System.out.println(
                            "Defectos de tipo Checking a la fecha: "+
                            buildCodeCompile+" inyectados en Codificación y "
                                    + "\nremovidos en Compilación.");
                }
                if (checkingDesignTest>0) {
                    System.out.println(
                            "Defectos de tipo Checking a la fecha: "+
                            checkingDesignTest+" inyectados en Diseño y "
                                    + "\nremovidos en Testing.");
                }
                if (dataCodeCompile>0) {
                    System.out.println("Defectos de tipo Data a la fecha: "+
                            dataCodeCompile+" inyectados en Codificación y "
                                    + "\nremovidos en Compilación.");
                }
                if (dataDesignTest>0) {
                    System.out.println("Defectos de tipo Data a la fecha: "+
                            dataDesignTest+" inyectados en Diseño y "
                                    + "\nremovidos en Testing.");
                }
                if (functionCodeCompile>0) {
                    System.out.println(
                           "Defectos de tipo Function a la fecha: "+
                           functionCodeCompile+" inyectados en Codificación y "
                                    + "\nremovidos en Compilación.");
                }
                if (functionDesignTest>0) {
                    System.out.println(
                            "Defectos de tipo Function a la fecha: "+
                            functionDesignTest+" inyectados en Diseño y "
                                    + "\nremovidos en Testing.");
                }
                if (systemCodeCompile>0) {
                    System.out.println("Defectos de tipo System a la fecha: "+
                            systemCodeCompile+"  inyectados en Codificación y "
                                    + "\nremovidos en Compilación.");
                }
                if (systemDesignTest>0) {
                    System.out.println("Defectos de tipo System a la fecha: "+
                            systemDesignTest+"  inyectados en Diseño y "
                                    + "\nremovidos en Testing.");
                }
                if (environmentCodeCompile>0) {
                    System.out.println(
                            "Defectos de tipo Environment a la fecha: "+
                             environmentCodeCompile+
                                    " inyectados en Codificación y "
                                    + "\nremovidos en Compilación.");
                }
                if (environmentDesignTest>0) {
                    System.out.println(
                            "Defectos de tipo Environment a la fecha: "+
                            environmentDesignTest+" inyectados en Diseño y "
                                    + "\nremovidos en Testing.");
                }            
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