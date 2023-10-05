/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sintetizador;

/**
 *
 * @author nando
 */
import java.util.Scanner;
import javax.speech.*;
import javax.speech.synthesis.*;
public class Sintetizador {


public class TextToSpeech {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter text to be read: ");
            String inputText = scanner.nextLine();

            Synthesizer synthesizer = Central.createSynthesizer(null);
            synthesizer.allocate();
            synthesizer.resume();
            synthesizer.speakPlainText(inputText, null);
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.deallocate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

}
