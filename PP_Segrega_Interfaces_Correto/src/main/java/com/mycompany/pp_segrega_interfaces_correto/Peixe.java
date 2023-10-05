/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_segrega_interfaces_correto;

/**
 *
 * @author nando
 */
public class Peixe implements AnimalAquatico {
    @Override
    public void comer() {
        System.out.println("Peixe comendo.");
    }
    
    @Override
    public void nadar() {
        System.out.println("Peixe nadando.");
    }
}
