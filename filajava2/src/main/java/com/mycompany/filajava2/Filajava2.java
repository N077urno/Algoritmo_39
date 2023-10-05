/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filajava2;

/**
 *
 * @author nando
 */
public class Filajava2 {

    public static void main(String[] args) {
        Aluno A = new Aluno();
        Aluno B = new Aluno();
        Aluno C = new Aluno();
        Aluno D = new Aluno();
        Aluno E = new Aluno();
        Aluno resp = new Aluno();
        
        A.nome = "Jose";
        A.curso = "TSI";
        A.idade = 20;
        A.matricula = 1001;
        A.semestre = 2;
        
        B.nome = "Ana";
        B.curso = "BCC";
        B.idade = 22;
        B.matricula = 1002;
        B.semestre = 1;
        
        C.nome = "Maria";
        C.curso = "Agro";
        C.idade = 25;
        C.matricula = 1003;
        C.semestre = 3;
        
        D.nome = "Joao";
        D.curso = "Ali";
        D.idade = 18;
        D.matricula = 1004;
        D.semestre = 5;
        
        E.nome = "Helenna";
        E.curso = "Med";
        E.idade = 19;
        E.matricula = 1005;
        E.semestre = 1;
        
        Fila fila = new Fila();
        
        fila.insere(D);
        fila.insere(E);
        fila.insere(B);
        
        if(fila.fila_vazia())
            System.out.println("Fila Vazia, Não posso retirar nenhum aluno da fila");
        else{
            resp = fila.remove();
            fila.imprimir(resp);
           
        }
        
        fila.insere(A);
        
        if(fila.fila_vazia())
            System.out.println("Fila Vazia, Não posso retirar nenhum aluno da fila");
        else{
            resp = fila.remove();
            fila.imprimir(resp);
           
        }
        
        fila.insere(C);
        
        if(fila.fila_vazia())
            System.out.println("Fila Vazia, Não posso retirar nenhum aluno da fila");
        else{
            resp = fila.remove();
            fila.imprimir(resp);
           
        }
        
        if(fila.fila_vazia())
            System.out.println("Fila Vazia, Não posso retirar nenhum aluno da fila");
        else{
            resp = fila.remove();
            fila.imprimir(resp);
           
        }
        
        if(fila.fila_vazia())
            System.out.println("Fila Vazia, Não posso retirar nenhum aluno da fila");
        else{
            resp = fila.remove();
            fila.imprimir(resp);
           
        }
        
        if(fila.fila_vazia())
            System.out.println("Fila Vazia, Não posso retirar nenhum aluno da fila");
        else{
            
            fila.imprimir(fila.remove()
            );
           
        }
        
                
                
    }
}
