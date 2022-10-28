/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio08;

/**
 *
 * @author UTPL
 */
public class Ejercicio08 {

    public static void main(String[] args) {
         int a = 10;
        int b = 9;
        int c = 20;
        int d = 500;
        int e = 2;
        int f = 3;
        int g = 200;
        int i = 50;
        int h = 51;
        
        boolean resultado = ((a * b) + c - d / e + Math.pow(f, e) >= g) || (i >= i - i + h);
        System.out.println(resultado);
        System.out.println("Elaborado por Daniel Ojeda");
    }
}
