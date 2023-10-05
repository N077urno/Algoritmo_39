/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_inversao_de_dependencia_correto;

/**
 *
 * @author nando
 */
public class MySqlDataBase implements DataBase {
    public void save(Order order) {
        System.out.println("código para salvar o pedido no banco de dados MySQL");
    }
}
