/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_segrega_interfaces_errado;

/**
 *
 * @author nando
 */
public class Pato implements Animal {
    @Override
    public void comer() {
        System.out.println("Pato comendo.");
    }
    
    @Override
    public void nadar() {
        System.out.println("Pato nadando.");
    }
    
    @Override
    public void voar() {
        System.out.println("Pato voando.");
    }
}
