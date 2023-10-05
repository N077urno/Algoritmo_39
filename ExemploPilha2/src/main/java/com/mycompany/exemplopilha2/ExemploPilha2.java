/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplopilha2;

/**
 *
 * @author nando
 */
public class ExemploPilha2 {

    public static void main(String[] args) {
        int topo=-1,topo2=-1,cont=0;
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        
        for(int i=0;i<10;i++){
            if(cont != 3){
                topo=pilha1.push(topo, i);
                cont++;
            }else{
                topo2=pilha2.push(topo2, pilha1.pop(topo));
                cont=0;
            }
        }
        
        pilha1.imprimir(topo);
        System.out.println("---------");
        pilha2.imprimir(topo2);
        
        
        
                
        
        
        
    }
}
