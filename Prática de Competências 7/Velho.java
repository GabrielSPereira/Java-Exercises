/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posaulapooaula7;

/**
 *
 * @author GABRIEL
 */
public class Velho extends Imovel{
    public void setPreco() {
        this.preco -= 1000;
    } 
    
    public float getPreco() {
        return this.preco;
    }   
}
