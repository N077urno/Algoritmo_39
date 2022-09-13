/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comparadordecodigo;

/**
 *
 * @author nando
 */
public class PadronizaVariavel {
     char[] cod;
     char[] aux;
     String[] vri;
     String codigo;
     int var=0;
     
    public void converteStringChar(LerArquivo codigo){
     this.cod = new char[codigo.arq1.length()];
     
     for(int i=0; i<this.cod.length;i++){
         this.cod[i] = codigo.arq1.charAt(i);
     }
     
     System.out.println("---- Impressao vetor char ---");
     
     for(int i=0; i<this.cod.length;i++){
         System.out.print(this.cod[i]);
     }
     
     System.out.println("---- Fim da Impressao vetor char ---");
        
    }
    
    
        
    public void padronizaInt(){
        aux = new char[this.cod.length];
        
        vri = new String[this.cod.length];
        int j=0;
        
        for(int i=0;i<this.cod.length;i++){
            vri[i]="";
        }
        
        for(int i=0; i<this.cod.length;i++){
            if(this.cod[i] != 'i'){
                aux[i] = this.cod[i];
                
            }else{
                j=i;
                
                if((this.cod[j+1]=='n')&&(this.cod[j+2]=='t')&&(this.cod[j+3]==' ')){
                    j=j+4;
                    
                    while((this.cod[j]!=';')&&(this.cod[j]!=')')){
                        if((this.cod[j]!=' ')&&(this.cod[j]!='=')&&(this.cod[j]!='0')&&(this.cod[j]!='1')&&(this.cod[j]!='2')&&(this.cod[j]!='3')){
                            vri[var] = vri[var] + this.cod[j];
                        }
                        
                        j++;
                    }
                    
                    System.out.println("---- Impressao da variavel vri ---");
                    System.out.println(vri[var]);
                    System.out.println("---- fim de vri ---");
                    var++;
                    
                    
                    if(this.cod[j]==';'){
                        aux[i] ='v';
                        aux[i+1]='r';
                        aux[i+2]='i';
                        i=i+3;
                        while(i<=(j-1)){
                            aux[i]=' ';
                            i++;
                        }
                        aux[i]=this.cod[j];
                    }
                    
                    if(this.cod[j]==')'){
                        aux[i] ='m';
                        aux[i+1]='d';
                        aux[i+2]='i';
                        aux[i+3]=' ';
                        aux[i+4]='(';
                        i=i+5;
                        while(i<=(j-1)){
                           aux[i]=' ';
                            i++;
                        }
                        
                        aux[i]=this.cod[j];
                    }
                }else{
                    aux[i]=this.cod[i];
                }
            }
        }
        
    System.out.println("---- Impressao vetor aux ---");
     
     for(int i=0; i<aux.length;i++){
         System.out.print(aux[i]);
     }
     
     System.out.println("---- Fim da Impressao vetor aux ---");
     
     this.codigo = String.valueOf(aux);
     
     trocaString();
     
    }
    
    public void trocaString(){
        for(int i=0;i<=var;i++){
            if(codigo.matches(vri[i]))
                codigo.replaceAll(vri[i],"vri"); 
        }
        
        System.out.println("---- Impressao string codigo ---");
     
        System.out.println(codigo);
     
        System.out.println("---- Fim da Impressao string codigo ---");
    }
}
