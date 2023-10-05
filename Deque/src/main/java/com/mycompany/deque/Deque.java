/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.deque;

/**
 *
 * @author nando
 */
public class Deque {

    public static void main(String[] args) {
        DequeTeste deque = new DequeTeste();
               
        deque.inicio = deque.inicializaDeque(deque.inicio, 0, "teste", 10);
        deque.imprimirDeque(deque.inicio);
        
        deque.inicio = deque.insereNoComeco(1, "teste2", 20, deque.inicio);
        //deque.imprimirDeque(deque.inicio);
        
        deque.inicio = deque.insereNoComeco(2, "teste3", 30, deque.inicio);
        deque.imprimirDeque(deque.inicio);
    }
}
