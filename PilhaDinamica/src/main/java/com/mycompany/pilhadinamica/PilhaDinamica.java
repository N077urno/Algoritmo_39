/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilhadinamica;

/**
 *
 * @author nando
 */
public class PilhaDinamica {

    public static void main(String[] args) {
        StackDinamica pilhaDinamica = new StackDinamica(); //estanciar a pilha
        
        
        pilhaDinamica.imprimir(); //imprimir a pilha
        
        pilhaDinamica.push("Helenna","123"); //insere na pilha
        
        pilhaDinamica.imprimir(); //imprimir
        
        System.out.println("-----------");
        
        pilhaDinamica.push("Maria","456"); //insere na pilha
        pilhaDinamica.imprimir(); //imprimir
        
        
        
        System.out.println("O tamanho atual da pilha eh..: "+pilhaDinamica.sizePilha());
        // imprime o tamanho
        
        System.out.println("-----------");
        
        pilhaDinamica.top(); // indica quem tá no topo
        
        System.out.println("-----------");
        
        
        pilhaDinamica.pop(); // retira um elemento da pilha
        System.out.println("-----------");
        
        
        System.out.println("O tamanho atual da pilha eh..: "+pilhaDinamica.sizePilha());
        //imprime o tamanho da pilha 
        System.out.println("-----------");
        
        pilhaDinamica.top(); //mostra quem tá no topo
        System.out.println("-----------");
        
    }
}
