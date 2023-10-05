/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhadinamica;

/**
 *
 * @author nando
 */
public class StackDinamica {
    CelulaPilha top = null; //topo da pilha que é uma célula
    
    void push(String nome, String cpf){
        CelulaPilha novaCelula = new CelulaPilha(); //cria a nova célula
        novaCelula.setNome(nome); //insere o nome na nova célula
        novaCelula.setCPF(cpf);
        novaCelula.setAnterior(this.top); //coloca a referencia para o topo atual
        this.top = novaCelula; //atualiza o valor do topo 
    }
    
    void pop(){
        if(!isEmpty()){//verifica se a pilha NÃO está vazia
            System.out.println("Retirando nome da pilha..: "+this.top.getNome()); //imprime o nome dentro da célula
            System.out.println("Retirando CPF da pilha..: "+this.top.getCpf()); //imprime o nome dentro da célula
            this.top = this.top.getAnterior(); //faz o topo da pilha ir para a célula anterior
        }else{ //caso esteja fazia
            System.out.println("Pilha Vazia!!!");//imprime pilha vazia
        }
    }
    
    boolean isEmpty(){
        if(this.top == null){ //verifica se o topo está em NULL
            return true; //caso esteja em null, retorne verdadeiro, pilha vazia
        }else{
            return false;//caso a pilha não esteja vazia, retorne false
        }
    }
    
    int sizePilha(){
        CelulaPilha p; // referência para uma célula
        int cont = 0; // contador iniciado em 0
        p = this.top; //referência aponta para a célula no topo
        while(p != null){ // verifica se a referência está apontando para null
            p = p.getAnterior(); //pega a referência anterior
            cont++; //incrementa o valor do contador
        }
        
        return cont; //retorna a quantidade de células na pilha
    }
    
    void imprimir(){
        CelulaPilha p; //Cria a referência para a célula
        p = this.top; //faz a referência apontar para o topo da pilha
        
        if(isEmpty()){ //verífica se a pilha está vazia
            System.out.println("Pilha Vazia!!!"); //imprime pilha vazia
        }else{ //caso a pilha não esteja vazia
            while(p != null){ //verifica se a referência está em NULL
                System.out.println("Nome na pilha..: " +p.getNome());
                System.out.println("CPF na pilha..: " +p.getCpf()); 
                //se não tiver, imprime o dado da célula
                p = p.getAnterior(); //faz a referência apontar para a célula anterior 
            }
        }
    }
    
    /***************************************************************/
    //       Nome do método: void top()
    //       método para imprimir o nome no topo da lista
    //       Autor: Fernando
    //       Data: 23/11/2022
    //       Modificação: 23/11/2022
    //       versão: 1.0
    /***************************************************************/
    void top(){
        if(isEmpty()){ //verifica se a pilha está vazia
            System.out.println("Pilha Vazia!!!"); //imprime pilha vazia
            
        }else{ //caso contrário
            System.out.println("Nome no topo da pilha..: "+top.getNome());
            System.out.println("CPF no topo da pilha..: "+top.getCpf());
            //imprime o nome que estiver no topo da pilha
        }
    }
                
    
}
