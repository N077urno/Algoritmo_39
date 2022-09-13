/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comparadordecodigo;

import java.util.ArrayList;

/**
 *
 * @author nando
 */
public class PreAnaliseRemoveEspacos {
    char[] codigo_nu;
    boolean comentario = false;
    int tamanho;
    
    public PreAnaliseRemoveEspacos(String codigo){
        this.tamanho = 0;
        this.codigo_nu = new char[codigo.length()];
        
        codigo = codigo.replace("/*","#");
        codigo = codigo.replace("*/","$");
        codigo = codigo.replaceAll(" ", "");
        codigo = codigo.replaceAll("\n","");
        codigo = codigo.replaceAll("\t","");
        
        for(int i=0; i<codigo.length();i++){
            if(codigo.charAt(i)=='#'){
                this.comentario = true;
            }
        
            if(!this.comentario){
                this.codigo_nu[this.tamanho]=codigo.charAt(i);
                this.tamanho++;
            }
            
            if(codigo.charAt(i)=='$'){
                this.comentario = false;
            }
            
        }
            
    }
        
        
                
    }
    
    

