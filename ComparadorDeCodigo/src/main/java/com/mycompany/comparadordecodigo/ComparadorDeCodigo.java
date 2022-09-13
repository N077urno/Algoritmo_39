/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.comparadordecodigo;

import java.io.IOException;

/**
 *
 * @author nando
 */
public class ComparadorDeCodigo {

    public static void main(String[] args) throws IOException {
       String semComentarios;
        
        LerArquivo arquivo = new LerArquivo();
        
        arquivo.LerArquivoPrincipalJava("E:\\teste1.java"); //D:\\teste1.java
        //arquivo.concatenaArquivos("E:\\Pilha.java"); //D:\\teste1.java
        
        ConverteMinusculo lower = new ConverteMinusculo();
        
        arquivo.arq2 = lower.converteMinusculo(arquivo.arq1);
                
        
        System.out.println(arquivo.arq2);
        
        System.out.println("Tamanho do codigo original..: "+arquivo.arq2.length());
        
        System.out.println("-------------");
        
        
  
        
        
        
        System.out.println("------------- xxxx");
        System.out.println(arquivo.arq2);
        
        ContaPalavrasChaves palavras = new ContaPalavrasChaves();
        
        palavras.ContaPalavrasChaves(arquivo.arq2);
        
        System.out.println("Contagem de Palavras chaves");
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        
        System.out.println("Modificadores de Acesso");
        System.out.println("[Palavra chave private]..: "+palavras.cprivate);
        System.out.println("[Palavra chave protected]..: "+palavras.cprotected);
        System.out.println("[Palavra chave public]..: "+palavras.cpublic);
        
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        
        System.out.println("Modificadores de classes, variaveis ou metodo");
        System.out.println("[Palavra chave abstract]..: "+palavras.cabstract);
        System.out.println("[Palavra chave class]..: "+palavras.cclass);
        System.out.println("[Palavra chave extends]..: "+palavras.cextends);
        System.out.println("[Palavra chave final]..: "+palavras.cfinal);
        System.out.println("[Palavra chave implements]..: "+palavras.cimplements);
        System.out.println("[Palavra chave interface]..: "+palavras.cinterface);
        System.out.println("[Palavra chave native]..: "+palavras.cnative);
        System.out.println("[Palavra chave new]..: "+palavras.cnew);
        System.out.println("[Palavra chave static]..: "+palavras.cstatic);
        System.out.println("[Palavra chave strictfp]..: "+palavras.cstrictfp);
        System.out.println("[Palavra chave synchronized]..: "+palavras.csynchronized);
        System.out.println("[Palavra chave transient]..: "+palavras.ctransient);
        System.out.println("[Palavra chave volatile]..: "+palavras.cvolatile);
        
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        
        System.out.println("Tipos Primitivos");        
        System.out.println("[Palavra chave int]..: "+palavras.cint);
        System.out.println("[Palavra chave string]..: "+palavras.cstring);
        System.out.println("[Palavra chave boolean]..: "+palavras.cboolean);
        System.out.println("[Palavra chave byte]..: "+palavras.cbyte);
        System.out.println("[Palavra chave char]..: "+palavras.cchar);
        System.out.println("[Palavra chave double]..: "+palavras.cdouble);
        System.out.println("[Palavra chave float]..: "+palavras.cfloat);
        System.out.println("[Palavra chave long]..: "+palavras.clong);
        System.out.println("[Palavra chave short]..: "+palavras.cshort);
        
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        
        System.out.println("Controle de Fluxo dentro de um bloco de codigo");        
        System.out.println("[Palavra chave if]..: "+palavras.cif);
        System.out.println("[Palavra chave break]..: "+palavras.cbreak);
        System.out.println("[Palavra chave case]..: "+palavras.ccase);
        System.out.println("[Palavra chave continue]..: "+palavras.ccontinue);
        System.out.println("[Palavra chave default]..: "+palavras.cdefault);
        System.out.println("[Palavra chave do]..: "+palavras.cdo);
        System.out.println("[Palavra chave else]..: "+palavras.celse);
        System.out.println("[Palavra chave for]..: "+palavras.cfor);
        System.out.println("[Palavra chave instanceof]..: "+palavras.cinstanceof);
        System.out.println("[Palavra chave return]..: "+palavras.creturn);
        System.out.println("[Palavra chave switch]..: "+palavras.cswitch);
        System.out.println("[Palavra chave while]..: "+palavras.cwhile);
        
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        
        System.out.println("Tratamento de Erro"); 
        System.out.println("[Palavra chave assert]..: "+palavras.cassert);
        System.out.println("[Palavra chave catch]..: "+palavras.ccatch);
        System.out.println("[Palavra chave finally]..: "+palavras.cfinally);
        System.out.println("[Palavra chave throw]..: "+palavras.cthrow);
        System.out.println("[Palavra chave throws]..: "+palavras.cthrows);
        System.out.println("[Palavra chave try]..: "+palavras.ctry);
        
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        
        System.out.println("Controle de Pacotes"); 
        System.out.println("[Palavra chave import]..: "+palavras.cimport);
        System.out.println("[Palavra chave package]..: "+palavras.cpackage);
        
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        
        System.out.println("Variaveis de Referencia"); 
        System.out.println("[Palavra chave super]..: "+palavras.csuper);
        System.out.println("[Palavra chave this]..: "+palavras.cthis);
        System.out.println("[Palavra chave void]..: "+palavras.cvoid);
        
        System.out.println();
        System.out.println("-----------");
        System.out.println();
        
        System.out.println("Comandos para Impressao"); 
        System.out.println("[Comando System.out]..: "+palavras.csystemout);
        
        
        PadronizaVariavel pVar = new PadronizaVariavel();
        
        pVar.converteStringChar(arquivo);
        pVar.padronizaInt();
        
        arquivo.arq3 = String.valueOf(pVar.aux);
                
        
        PreAnaliseRemoveEspacos pre1 = new PreAnaliseRemoveEspacos(arquivo.arq3);
        
        for(int i=0; i<pre1.tamanho;i++){
            System.out.print(pre1.codigo_nu[i]);
        }
        
        System.out.println("Tamanho do codigo sem os comentarios..: "+pre1.tamanho);
        
        arquivo.arq3 = String.valueOf(pre1.codigo_nu);
        
        System.out.println("-------------");
        System.out.println(arquivo.arq3);
        

        
        
    }
}
