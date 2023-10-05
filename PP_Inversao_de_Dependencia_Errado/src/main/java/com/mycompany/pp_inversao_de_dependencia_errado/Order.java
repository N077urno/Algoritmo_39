/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_inversao_de_dependencia_errado;

/**
 *
 * @author nando
 */
public class Order {
    private DataBase db;

    public Order() {
        this.db = new DataBase();
    }

    public void save() {
        db.save(this);
    }
}
