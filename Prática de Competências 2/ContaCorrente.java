/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posaulapooaula2;

/**
 *
 * @author GABRIEL
 */
public class ContaCorrente {
    int numero;
    float saldo;
    boolean status;
    float limite;
    Movimentacao movimentacao;
        
    public void Altera_Status(boolean status){
        this.status = !status;
    }
    
    public void Altera_Limites(){
        
    }
    
    public void Movimenta(){
        
    }
    
    public float Mostra_Saldo(){
        return saldo;
    }
    
    public void Extrato(){
        
    }
}
