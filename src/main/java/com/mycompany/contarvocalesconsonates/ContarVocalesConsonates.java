/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contarvocalesconsonates;

import java.util.Scanner;

/**
 *
 * @author Roberto Calero
 */
public class ContarVocalesConsonates {

    public static void main(String[] args) {
       Scanner temp = new Scanner(System.in);
       String palabra;
       char vocal;
       int letras =0, contadorv =0, contadorc =0;
       
            System.out.println("Contar vocales y consonantes");
            System.out.println("Ingrese Palabra");
            palabra = temp.nextLine();
            palabra = palabra.toLowerCase();
            letras = palabra.length();
            
                for (int x = 0 ; x < letras; x++){
                    vocal = palabra.charAt(x);
                    if(vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u'){
                        contadorv++;
                    }else{
                        if(vocal != ' '){
                         contadorc++;   
                        }
                    }
                }
            System.out.println("Cantidad vocales: "+contadorv);
            System.out.println("Cantidad consonates: "+contadorc);
    }
}
