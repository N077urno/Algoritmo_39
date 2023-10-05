/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeadasimples1;

/**
 *
 * @author nando
 */
public class Celula {
    Celula proxima;
    Object elemento;
    
    Celula(Celula proxima, Object elemento){
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    Celula(Object elemento){
        this.elemento = elemento;
    }
    
    void setProxima(Celula proxima){
        this.proxima = proxima;
    }
    
    Celula getProxima(){
        return(this.proxima);
    }
    
    Object getElemento(){
        return(this.elemento);
    }
}
