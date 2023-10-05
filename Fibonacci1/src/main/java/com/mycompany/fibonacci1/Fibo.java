/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fibonacci1;

/**
 *
 * @author nando
 */
public class Fibo {
    int termoFibo(int x){
        /*
        if(x < 2){ //caso trivial
            return(x);
        }
        return(termoFibo(x-1)+termoFibo(x-2));
        */
        return(x<2?x:termoFibo(x-1)+termoFibo(x-2));
    }
    
}
