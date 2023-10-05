/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadefilacarros;

/**
 *
 * @author Luísa Maira
 */
public class Carros {
    int idCarro;
    String cor; 
    String marca;
    
    public String getMarca () {
        return marca;
    }
    
    public void setMarca (String marca) {
        this.marca = marca;
    }
    
    public String getCor () {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getIdCarro (){
        return idCarro;
    }
    public void setIdCarro (int idCarro) {
        this.idCarro = idCarro;
    }
}

