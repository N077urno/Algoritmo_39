/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_liskov_certo;

/**
 *
 * @author nando
 */
public class Retangulo extends Forma {
    protected int altura;
    protected int largura;
    
    public Retangulo(int altura, int largura){
        this.setAltura(altura);
        this.setLargura(largura);
    }

    private void setAltura(int altura) {
        this.altura = altura;
    }

    private void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int getArea() {
        return(this.altura * this.largura);
    }
}
