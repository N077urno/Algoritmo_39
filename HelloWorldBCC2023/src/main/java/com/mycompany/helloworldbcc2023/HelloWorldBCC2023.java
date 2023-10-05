/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.helloworldbcc2023;

/**
 *
 * @author nando
 */
public class HelloWorldBCC2023 {

    public static void main(String[] args) {
        System.out.println("Hello World BCC 2023");
        System.out.println("Ola Mundo Java");
        
        NovoHelloWorld teste1 = new NovoHelloWorld();
        
        System.out.println("O número da turma eh..: "+teste1.turma);
        teste1.turma = '5';
        
        System.out.println("A nova turma eh a turma..: "+teste1.turma);
        
        NovoHelloWorld teste2 = new NovoHelloWorld();
        
        //teste2.turma = teste1.turma;
        
        System.out.println("A turma do objeto teste 2 eh..: "+teste2.turma);
    }
}
