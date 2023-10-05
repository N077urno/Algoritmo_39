/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_segrega_interfaces_correto;

/**
 *
 * @author nando
 */
public class PP_Segrega_Interfaces_Correto {

    public static void main(String[] args) {
        AnimalTerrestre pato = new Pato();
        pato.comer();

        AnimalAquatico patoAquatico = new Pato();
        patoAquatico.comer();
        patoAquatico.nadar();

        AnimalVoador patoVoador = new Pato();
        patoVoador.comer();
        patoVoador.voar();

        AnimalAquatico peixe = new Peixe();
        peixe.comer();
        peixe.nadar();
    }
}
