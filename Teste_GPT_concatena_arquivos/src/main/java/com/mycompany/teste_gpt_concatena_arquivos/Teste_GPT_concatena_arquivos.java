/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teste_gpt_concatena_arquivos;

/**
 *
 * @author nando
 */

import java.io.*;
import java.util.Scanner;

public class Teste_GPT_concatena_arquivos {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de arquivos a serem concatenados: ");
        int numFiles = scanner.nextInt();
        String[] fileNames = new String[numFiles];

        // Armazena os nomes dos arquivos a serem concatenados
        for (int i = 0; i < numFiles; i++) {
            System.out.print("Informe o nome do arquivo " + (i+1) + ": ");
            fileNames[i] = scanner.next();
        }

        // Nome do arquivo de saída
        String newFileName = "d:/input0.txt";

        try {
            // Cria um arquivo de saída
            FileWriter fileWriter = new FileWriter(newFileName);
            // Cria um buffer de escrita
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    // Lê cada arquivo e escreve o conteúdo no arquivo de saída
        for (String fileName : fileNames) {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
            }

            bufferedReader.close();
        }

        bufferedWriter.close();

        System.out.println("Arquivos concatenados com sucesso!");
    } catch (FileNotFoundException ex) {
        System.out.println("Arquivo não encontrado!");
    } catch (IOException ex) {
        System.out.println("Erro ao ler/escrever no arquivo!");
    }
}


}
