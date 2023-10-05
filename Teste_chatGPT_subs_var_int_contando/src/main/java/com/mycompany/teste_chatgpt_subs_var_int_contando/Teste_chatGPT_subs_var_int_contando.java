/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teste_chatgpt_subs_var_int_contando;

/**
 *
 * @author nando
 */

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Teste_chatGPT_subs_var_int_contando {


    public static void main(String[] args) {
        // Nome do arquivo de entrada
        String fileName = "d:/input1.txt";
        // Nome do arquivo de saída
        String newFileName = "d:/input2.txt";

        try {
            // Cria um arquivo de entrada
            FileReader fileReader = new FileReader(fileName);
            // Cria um buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Cria um arquivo de saída
            FileWriter fileWriter = new FileWriter(newFileName);
            // Cria um buffer de escrita
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Lista para armazenar as variáveis int encontradas
            ArrayList<String> intVariables = new ArrayList<>();
            // Contador para controlar a quantidade de variáveis int encontradas
            int intCounter = 0;

            // Variável para ler cada linha do arquivo
            String line;

            // Lê cada linha do arquivo
            while ((line = bufferedReader.readLine()) != null) {
                // Divide a linha em palavras
                String[] words = line.split(" ");

                // Verifica se cada palavra é uma variável int
                for (String word : words) {
                    // Verifica se a palavra é "int" e se ela não é uma palavra reservada
                    if (word.equals("int") && !intVariables.contains(words[1])) {
                        // Adiciona a variável na lista
                        intVariables.add(words[1]);
                        // Incrementa o contador de variáveis int
                        intCounter++;
                    }
                }

                // Substitui as ocorrências das variáveis int na linha
                for (int i = 0; i < intVariables.size(); i++) {
                    line = line.replaceAll(intVariables.get(i), "varint" + (i+1));
                }

                // Escreve a linha modificada no arquivo de saída
                bufferedWriter.write(line + "\n");
            }

            // Escreve a quantidade de variáveis int encontradas no arquivo de saída
            bufferedWriter.write("Quantidade de variáveis int encontradas: " + intCounter);

            // Fecha os buffers de leitura e escrita
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Arquivo modificado com sucesso!");
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException ex) {
            System.out.println("Erro ao ler/escrever no arquivo!");
        }
    }
}


