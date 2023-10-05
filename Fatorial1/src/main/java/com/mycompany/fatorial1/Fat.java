/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fatorial1;

/**
 *
 * @author nando
 */
public class Fat {
    int calcFat(int x){
        //caso trivial
        if(x == 1){
            return(1);
        }
        return(x*calcFat(x-1));
        
    }
    
}
