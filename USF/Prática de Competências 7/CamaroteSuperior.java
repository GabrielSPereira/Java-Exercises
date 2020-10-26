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
public class CamaroteSuperior extends VIP{
    public float getValor() {
        return this.valor;
    }   
    
    public void setLocalizacao(float valor) {
        this.valor = valor + this.valor;
    }  
}
