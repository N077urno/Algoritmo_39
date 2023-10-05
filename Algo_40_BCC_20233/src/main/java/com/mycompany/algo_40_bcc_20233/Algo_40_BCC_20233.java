/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algo_40_bcc_20233;

/**
 *
 * @author nando
 */
public class Algo_40_BCC_20233 {

    public static void main(String[] args) {
        Divisao objDivisao = new Divisao();
        
        objDivisao.iDividendo = 5;
        objDivisao.iDivisor = 2;
        
        objDivisao.iQuociente = objDivisao.iDividendo / objDivisao.iDivisor;
        objDivisao.iResto = objDivisao.iDividendo % objDivisao.iDivisor;
        
        System.out.println("O valor do dividendo eh..: "+objDivisao.iDividendo);
        System.out.println("O valor do divisor eh..: "+objDivisao.iDivisor);
        System.out.println("O valor do Quociente eh..: "+objDivisao.iQuociente);
        System.out.println("O valor do resto eh..: "+objDivisao.iResto);
    }
}
