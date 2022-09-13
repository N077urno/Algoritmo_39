/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.olamundotsi2022;

/**
 *
 * @author nando
 */
public class OlaMundoTSI2022 {

    public static void main(String[] args) {
        int idadeMinima = 20;
        int soma;
        System.out.println("Ola Mundo TSI 2022");
        System.out.println("Aprendendo JAVA");
        System.out.println("vamos usar o console");
        System.out.println("Não funciona muito bem com acentos tipo é");
        
        Aluno docente1 = new Aluno();
        
        docente1.nome = "Jose";
        docente1.idade = 15;
        docente1.telefone = 12345678;
        
        soma = docente1.idade;
        
        System.out.println("O nome do aluno eh..: "+docente1.nome);
        System.out.println("Idade do Jose..: "+docente1.idade);
        
        docente1.idade = idadeMinima;
        
        soma = soma + idadeMinima; 
        
        System.out.println("Idade do Jose..: "+docente1.idade);
        
        System.out.println("O valor de soma eh..: "+soma);
        
        Aluno docente2 = new Aluno();
        
        docente2.nome = "Maria";
        docente2.idade = 24;
        docente2.telefone = 987654321;
        
        System.out.println(docente2.nome);
        
        Carro carro = new Carro();
        
        carro.cor = "Azul";
        carro.marca = "VW";
        carro.modelo = "UP";
        carro.numeroDoChassis = "Z1P9321";
        carro.valor = 100000;
        
        System.out.println("Os dados do carro do Jose sao");
        System.out.println("cor..: "+carro.cor);
        System.out.println("marca..: "+carro.marca);
        System.out.println("modelo..: "+carro.modelo);
        System.out.println("chassis..: "+carro.numeroDoChassis);
        System.out.println("valor..: "+carro.valor);
        
    }
}
