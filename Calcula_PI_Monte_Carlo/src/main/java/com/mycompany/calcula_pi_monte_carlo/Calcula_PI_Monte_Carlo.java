/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calcula_pi_monte_carlo;

/**
 *
 * @author nando
 */

import java.util.Random;
public class Calcula_PI_Monte_Carlo {

    public static void main(String[] args) {
        // Número de pontos a serem gerados
    int numPoints = 10000000;

    // Gerador de números aleatórios
    Random random = new Random();

    // Contador de pontos que caem dentro do círculo
    int inCircle = 0;

    // Gera pontos aleatórios e conta quantos caem dentro do círculo
    for (int i = 0; i < numPoints; i++) {
      double x = random.nextDouble();
      double y = random.nextDouble();
      if (isInCircle(x, y)) {
        inCircle++;
      }
    }

    // Calcula o valor de pi com base no número de pontos gerados
    double pi = 4.0 * inCircle / numPoints;

    // Imprime o resultado
    System.out.println("O valor calculado de pi eh: " + pi);
  }

  // Verifica se um ponto (x, y) cai dentro do círculo de raio 1 centrado na origem
  private static boolean isInCircle(double x, double y) {
    return x * x + y * y <= 1;
    }
}
