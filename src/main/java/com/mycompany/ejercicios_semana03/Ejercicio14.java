/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicios_semana03;

import java.util.Scanner;

/**
 *
 * @author USER
 */
//Leer la Altura de N personas y calcular la altura media mostra cuantos hay superiores a la media.
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, N;
        int contMas = 0, contMenos=0;
        double media = 0;
         
        do {
            System.out.print("Numero de Personas: ");
            N = sc.nextInt();
        } while(N<=0);
        
        double[] alto = new double[N];
        
        System.out.println("Lectura de la altura de las personas");
        for (i = 0; i < N; i++) {
            System.out.print("Persona " + (i+1) + " = ");
            alto[i] = sc.nextDouble();
            media = media + alto[i];
        }
         media = media / N;
          for (i = 0; i < alto.length; i++) {
              if (alto[i] > media) {
                  contMas++;
              } else if  (alto[i] < media) {
                  contMenos++;       
                          }
              }
                  System.out.println("Estatura media: " + media);
                  System.out.println("Personas con estatura superior a la media " + contMas);
                  System.out.println("Personas con estatura inferior a la media " + contMenos);
          }
          
}