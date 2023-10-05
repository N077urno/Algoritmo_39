/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teste_gpt_remove_comentarios;

/**
 *
 * @author nando
 */
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Teste_GPT_remove_comentarios {

    public static void main(String[] args) {
        // Nome do arquivo de entrada
        String fileName = "d:/input0.txt";
        // Nome do arquivo de saída
        String newFileName = "d:/input1.txt";

        try {
            // Cria um arquivo de entrada
            FileReader fileReader = new FileReader(fileName);
            // Cria um buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Cria um arquivo de saída
            FileWriter fileWriter = new FileWriter(newFileName);
            // Cria um buffer de escrita
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Variável para ler cada linha do arquivo
            String line;
            boolean linewrite = true;
            // Lê cada linha do arquivo
            while ((line = bufferedReader.readLine()) != null) {
                // Remove os comentários de linha
                line = line.replaceAll("^\\s*//.*", "");
                // Remove os comentários entre /* e */
                
                if(line.startsWith("/*")||line.startsWith("/**")){
                    linewrite = false;
                    continue;
                }
                
                if(line.endsWith("*/")){
                    linewrite = true;
                    continue;
                }
                
                
                // Escreve a linha modificada no arquivo de saída
                
                if(linewrite){
                    bufferedWriter.write(line + "\n");
                }
                
            }
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



