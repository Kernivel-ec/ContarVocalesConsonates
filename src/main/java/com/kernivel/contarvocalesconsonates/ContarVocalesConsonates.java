/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kernivel.contarvocalesconsonates;
// Importamos la libreria para ingresar datos por teclado
import java.util.Scanner;

/**
 *
 * @author ING. Roberto Calero
 */
public class ContarVocalesConsonates {

    public static void main(String[] args) {
       // Definimos la variable de ingreso de datos por teclado
       Scanner temp = new Scanner(System.in);
       //Definimos las variables a utilizar
       String palabra;
       char vocal;
       int letras =0, contadorv =0, contadorc =0;
            //Titulo del programa
            System.out.println("Contar vocales y consonantes");
            // Peticion de ingreso de datos
            System.out.println("Ingrese Palabra");
            //Guardamos los datos ingresados en la variable "palabra"
            palabra = temp.nextLine();
            //Tranformamos el texto de la variable a minusculas
            // Nota: Esto lo hacemos para no tenes que comparar 'A' y 'a' ambas son vocales pero se comparan de manera independiente
            palabra = palabra.toLowerCase();
            //Obtenemos la cantidad de caracteres de la variable para utilizarlo en el ciclo
            letras = palabra.length();
                //Ciclo repetitivo inicia en cero hasta la cantidad de caracteres y va de uno en uno
                //Nota: recordemos que en programacion siempre iniciamos en 0 las posiciones en cadenas, vectores y matrices
                //Nota: tambien prodiamos x <= letras - 1, tomando en cuenta si la palabra tiene 4 caracteres/letras son 3 posiciones 0-1-2-3 
                for (int x = 0 ; x < letras; x++){
                    //Guardamos en la variable el caracter de la posicion x
                    vocal = palabra.charAt(x);
                    //Comparamos el caracter con las vocales
                    //Nota: para compara char/caracterres se usa '' y para cadenas/string se una ""
                    if(vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u'){
                        //Acumulador/contador de vocales
                        contadorv++;
                    }else{
                        //Condicion para espacios en blanco no sean contasdos como consonantes
                        if(vocal != ' '){
                         //Acumulador/contador de consonantes
                         contadorc++;   
                        }
                    }
                }
            //Salida de resultados
            System.out.println("Cantidad vocales: "+contadorv);
            System.out.println("Cantidad consonates: "+contadorc);
    }
}
//¿Como se cuando es una vocal o cosonante?
//Solo comparamos el grupo de menor catidad en este caso las vocales, si no es una vocal pór cosiguiente es una consonante