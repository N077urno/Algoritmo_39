/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadefilacarros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luísa Maira
 */
public class Fila {
     List <Carros> obj = new ArrayList<>();
    
    void inserir(Carros carro){
        this.obj.add(carro);
    }
    
        Object remover (){
        return (this.obj.remove(0));
    }
    
    boolean fila_vazia(){
        return(this.obj.isEmpty());
    }
    
    
    //Teste
    Object mostrar (int i){
        return this.obj.get(i);
    }
    
    boolean mostrar (List<Carros> obj) {
        throw new UnsupportedOperationException ("Not supported yet!");

    }   
}

