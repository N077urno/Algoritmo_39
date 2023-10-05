/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teste_gpt_remove_ponto_e_virgula;

/**
 *
 * @author nando
 */
import java.io.*;
public class Teste_GPT_remove_ponto_e_virgula {

    public static void main(String[] args) {
        // Nome do arquivo de entrada
        String fileName = "d:/input.txt";
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

            // Lê cada linha do arquivo
            while ((line = bufferedReader.readLine()) != null) {
                // Remove os ";" da linha
                line = line.replaceAll(";", "");

                // Escreve a linha modificada no arquivo de saída
                bufferedWriter.write(line + "\n");
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


