/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comparadordecodigo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author nando
 */
public class LerArquivo {
    String arq1;
    String arq2;
    String arq3;
    String arq4;
    
    public void LerArquivoPrincipalJava(String arquivo) throws FileNotFoundException, IOException{
        String s;
        FileInputStream input = new FileInputStream(arquivo);
        try{
            System.out.println("Arquivo carregado com sucesso");
            s = IOUtils.toString(input);
            this.arq1 = s;
        }finally{
            input.close();
        
        }
    }
    
    public void concatenaArquivos(String arquivo) throws FileNotFoundException, IOException{
        FileInputStream input = new FileInputStream(arquivo);
        String s;
        try{
            System.out.println("Arquivo anexado com sucesso");
            s = IOUtils.toString(input);
            this.arq1 = this.arq1+s;
           }finally{
            input.close();
        
        }
    }
}
