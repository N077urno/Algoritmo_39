/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplopilha;

/**
 *
 * @author nando
 */
public class ExemploPilha {

    public static void main(String[] args) {
     
       int topo=0, num;
       
       Pilha p1 = new Pilha();
       
       num = p1.tamanho();
       
       System.out.println("O tamanho da Pilha eh..: "+num);
       System.out.println("------------------------------");
       
       p1.imprimir(topo);
       
       System.out.println("------------------------------");
       
       topo = p1.push(topo, 5);
       p1.imprimir(topo);
       
       System.out.println("------------------------------");
       
       topo = p1.push(topo, 7);
       p1.imprimir(topo);
       
       System.out.println("------------------------------");
       
       topo = p1.push(topo, 2);
       p1.imprimir(topo);
       
       System.out.println("------------------------------");
       
       topo = p1.push(topo, 3);
       p1.imprimir(topo);
       
       System.out.println("------------------------------");
       
       num = p1.top(topo);
       System.out.println("O valor no topo da pilha eh..: "+num);
       topo = p1.push(topo, 4);
       num = p1.top(topo);
       System.out.println("O valor no topo da pilha eh..: "+num);
       p1.imprimir(topo);
       
       System.out.println("------------------------------");
       
       topo = p1.pop(topo);
       p1.imprimir(topo);
       
       num = p1.top(topo);
       System.out.println("O valor no topo da pilha eh..: "+num);
       
       for(int i=0;i<10;i++){
           
           topo=p1.pop(topo);
           p1.imprimir(topo);
           
           System.out.println("------------------------------");    
       }
      }
}
