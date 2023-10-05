/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculo_numero_aureo;

/**
 *
 * @author nando
 */
import java.math.BigDecimal;
public class Calculo_numero_aureo {
  public static void main(String[] args) {
    // Define a precisão do cálculo do número áureo
    int precision = 20;

    // Utiliza a biblioteca Math para calcular a raiz quadrada de 5
    BigDecimal sqrt5 = new BigDecimal(Math.sqrt(5));

    // Define o valor 1 com a precisão desejada
    BigDecimal one = new BigDecimal(1).setScale(precision);

    // Define o valor 2 com a precisão desejada
    BigDecimal two = new BigDecimal(2).setScale(precision);

    // Calcula o valor do número áureo
    BigDecimal phi = one.add(sqrt5).divide(two, precision, BigDecimal.ROUND_HALF_UP);

    // Imprime o resultado
    System.out.println("O valor do número áureo é: " + phi);
  }
}


