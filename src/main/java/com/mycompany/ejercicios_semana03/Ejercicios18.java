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
public class Ejercicios18 {
    
 public static void main(String[] args) {
        int[][]matriz=new int [10][10];
        int suma=0,cont;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
          for (int j =0; j < 10; j++) {
            System.out.print("Ingrese el numero en la posicion ("+i+")("+j+") : ");
            matriz[i][j]=(int) (Math.random()*100);
            System.out.println(""+matriz[i][j]);
            
        }
          
    }
      cont=9;
      for (int i = 0; i < 10; i++) {
          suma=suma+matriz[i][cont];
          cont--;
         
      }
        System.out.println("La suma de la diagonal secundaria es : " +suma);
    }
}

