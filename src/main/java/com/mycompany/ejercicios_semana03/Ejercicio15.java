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
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg= 0;//contadores para positivos y negativos
        int i;
        double sumaPos = 0, sumaNeg = 0;//suma de positivos y negativos
        //leemos los valores por teclado y los guardamos en el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++){
            System.out.print("numeros["+1+"] ");
            numeros[i]=sc.nextInt();
        }
        //se recorre el array para sumar positivos y negativos
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i]< 0){//sumar postivos
                sumaPos += numeros[i];
                pos++;
        }else if (numeros[1]< 0){//sumar negativos
            sumaNeg += numeros[i];
            neg++;
        }
            
        }
        //mostrar resultados
        if (pos!=0){
            System.out.println("Media de los valores positivos; " + sumaPos/pos);
        }else{
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg!= 0){
            System.out.println("Media de los valores negativos:" + sumaNeg / neg);
        }else{
            System.out.println("No ha introducido numeros negativos");
        }
    }
}

    

