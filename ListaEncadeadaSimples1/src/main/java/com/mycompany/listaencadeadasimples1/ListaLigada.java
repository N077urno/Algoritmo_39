/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeadasimples1;

/**
 *
 * @author nando
 */
public class ListaLigada {
    Celula primeira;
    Celula ultima;
    int totalDeElementos = 0;
    
    void adicionaNoComeco(Object elemento){
        Celula nova = new Celula(this.primeira,elemento);
        this.primeira = nova;
        if(this.totalDeElementos == 0){
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;
    }
    
    void adiciona(Object elemento){
        if(this.totalDeElementos == 0){
            this.adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }
    
    boolean posicaoOcupada(int pos){
        return((pos >= 0)&&(pos < this.totalDeElementos));
    }
    
    Celula pegaCelula(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posicao nao existe");
        }else{
            Celula atual = this.primeira;
            for(int i = 0; i< pos; i++){
                atual = atual.getProxima();
            }
            return(atual);
        }
    }
    
    void adiciona(int pos, Object elemento){
        if(pos == 0){
            this.adicionaNoComeco(elemento);
        }else if(pos == this.totalDeElementos){
            this.adiciona(elemento);
        }else {
            Celula anterior = this.pegaCelula(pos-1);
            Celula nova = new Celula(anterior.getProxima(),elemento);
            anterior.setProxima(nova);
            this.totalDeElementos++;
        }
    }
    
    Object pega(int posicao){
        return(this.pegaCelula(posicao).getElemento());
    }
    
    void removeDoComeco(){
        if(!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posicao nao Existe");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalDeElementos--;
            if(this.totalDeElementos == 0){
                this.ultima = null;
            }
        }
    }
    
    boolean contem(Object elemento){
        Celula atual = this.primeira;
        while(atual != null){
            if(atual.getElemento().equals(elemento)){
                return(true);
            }
            atual = atual.getProxima();
        }
        return(false);
    }
    
    int tamanho(){
        return(this.totalDeElementos);
    }
    
    void imprimir(ListaLigada lista){
        if(lista.primeira == null){
            System.out.println("A lista esta vazia");
        }else{
            Celula corrente = this.primeira;
            
            for(int i = 1; i <= this.tamanho(); i++){
               Paciente atual = (Paciente) corrente.elemento;
                
               System.out.println("---------");
               System.out.println("Posicao da Lista..: "+i);
               System.out.println("Nome..: "+atual.nome);
               System.out.println("Idade..: "+atual.Idade);
               System.out.println("Sexo..: "+atual.sexo);
               System.out.println("---------");
               
               corrente = corrente.getProxima();
            }
            
            System.out.println("********");
            
        }
    }
}
