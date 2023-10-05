/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibonacci1;

/**
 *
 * @author nando
 */
public class Fibonacci1 {

    public static void main(String[] args) {
        int num;
        
        Fibo f = new Fibo();
        
        for(int i=35;i>=1;i--){
          num = f.termoFibo(i);
          System.out.println("O valor de fibonacci na posicao "+i+" eh..: "+num);
        }
    }
}
