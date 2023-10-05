/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaencadeadasimples1;

/**
 *
 * @author nando
 */
public class ListaEncadeadaSimples1 {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        Paciente p1 = new Paciente();
        p1.Idade = 8;
        p1.nome = "Lisa";
        p1.sexo = 'f';
        
        Paciente p2 = new Paciente();
        p2.Idade = 10;
        p2.nome = "Bart";
        p2.sexo = 'm';
        
        Paciente p3 = new Paciente();
        p3.Idade = 40;
        p3.nome = "Margie";
        p3.sexo = 'f';
        
        Paciente p4 = new Paciente();
        p4.Idade = 70;
        p4.nome = "Homer";
        p4.sexo = 'm';
        
        Paciente p5 = new Paciente();
        p5.Idade = 2;
        p5.nome = "Maggie";
        p5.sexo = 'f';
        
        lista.adiciona(p1);
        lista.adiciona(p3);
        lista.adiciona(p5);
        lista.adiciona(p2);
        lista.adiciona(p4);
        
        lista.imprimir(lista);
        
        lista.removeDoComeco();
        
        lista.imprimir(lista);
        
        Paciente p6 = new Paciente();
        p6.Idade = 45;
        p6.nome = "Mol";
        p6.sexo = 'M';
        
        Paciente p7 = new Paciente();
        p7.Idade = 50;
        p7.nome = "Barney";
        p7.sexo = 'm';
        
        lista.adiciona(2, p6);
        
        lista.imprimir(lista);
        
        lista.adiciona(1, p7);
        
        lista.imprimir(lista);
    }
}
