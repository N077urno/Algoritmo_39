/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teste_chatgpt_substitui_variaveis_do_tipo_int;

/**
 *
 * @author nando
 */

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste_chatGPT_substitui_variaveis_do_tipo_int {

    public static void main(String[] args) {
        try {
            File file = new File("d:/input.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder sb = new StringBuilder();
            Set<String> variables = new HashSet<String>();
            String pattern = "(int\\s+)(\\w+)";
            Pattern r = Pattern.compile(pattern);
            while ((line = reader.readLine()) != null) {
                Matcher m = r.matcher(line);
                if (m.find()) {
                    variables.add(m.group(2));
                }
                sb.append(line + "\n");
            }
            reader.close();

            // substituir nomes de variáveis int
            for (String variable : variables) {
                sb.replace(0, sb.length(), sb.toString().replaceAll("\\b"+variable+"\\b", "varint"));
            }

            FileWriter writer = new FileWriter("d:/output.txt");
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







