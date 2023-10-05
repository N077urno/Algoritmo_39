/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_inversao_de_dependencia_correto;

/**
 *
 * @author nando
 */
public class PP_Inversao_de_Dependencia_Correto {

    public static void main(String[] args) {
        DataBase db = new MySqlDataBase();
        Order order = new Order(db);
        order.save();
        
        DataBase db2 = new SqlServer();
        
        Order order2 = new Order(db2);
        order2.save();
    }
}
