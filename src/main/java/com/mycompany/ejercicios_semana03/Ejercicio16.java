/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_semana03;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio16 {
     private static String i;
    public static void main(String[] args){
        int[][] num = new int[3][3];
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese los números");
        
        for(int i =0; i < num.length; i++){//Dimension uno.
            for (int j = 0; j < num.length; j++){//Dimension dos.
                num[i][j]=numero.nextInt();    
            }
        }
        System.out.println("Imprimiendo Tabla: ");
        for (int i =0; i < num.length; i++){
            System.out.println();
            for (int j =0; j < num.length; j++) {
            System.out.print(num[i][j]+ "");
            
        }
    } 
     System.out.println("\nSuma de Filas");
        int suma = 0;
     for(int i = 0; i < num.length; i++) {
         for (int j = 0; j < num.length; j++) {
            suma+=num[i][j];
         }
              System.out.println("Fila "+i+"="+suma);
              suma=0;
               }
           System.out.println("\nSuma Columna");
           for (int i = 0; i < num.length; i++) {
               for (int j = 0; j < num.length; j++){
                   suma += num[j][i];
                   
               }
               System.out.println("Columna" + i + "=" + suma);
               suma=0;
           }
}

}              
    

