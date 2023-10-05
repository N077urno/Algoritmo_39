/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filajava2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nando
 */
public class Fila {
    List <Aluno> alunos = new ArrayList<>();
    
    void insere(Aluno A){
        this.alunos.add(A);
    }
    
    Aluno remove(){
        return(this.alunos.remove(0));
    }
    
    boolean fila_vazia(){
        return(this.alunos.isEmpty());
    }
    
    void libera_fila(){
        this.alunos.clear();
    }
    
    void imprimir(Aluno aluno){
        System.out.println("-----------------------");
        System.out.println("O nome do aluno eh..: "+aluno.nome);
        System.out.println("O curso do aluno eh..: "+aluno.curso);
        System.out.println("A idade do aluno eh..: "+aluno.idade);
        System.out.println("A matricula do aluno eh..: "+aluno.matricula);
        System.out.println("O semestre do aluno eh..: "+aluno.semestre);
    }
    
}
