/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_segrega_interfaces_errado;

/**
 *
 * @author nando
 */
public class Peixe implements Animal {
    @Override
    public void comer() {
        System.out.println("Peixe comendo.");
    }
    
    @Override
    public void nadar() {
        System.out.println("Peixe nadando.");
    }
    
    @Override
    public void voar() {
        // Não é possível implementar esse método, já que peixes não voam
    }
}
