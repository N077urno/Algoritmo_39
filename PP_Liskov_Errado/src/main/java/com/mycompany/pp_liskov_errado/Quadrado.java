/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_liskov_errado;

/**
 *
 * @author nando
 */
public class Quadrado extends Retangulo {
    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }

    @Override
    public void setLargura(int largura) {
        super.setAltura(largura);
        super.setLargura(largura);
    }
}
