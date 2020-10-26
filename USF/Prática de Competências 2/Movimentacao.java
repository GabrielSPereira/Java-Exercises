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
public class Movimentacao {
    String descricao;
    float valor;
    boolean IsCredito;   
    
    public void Deposito(Double quantia){
        valor += quantia;
    }
    
    public void Saque(Double quantia){
        valor -= quantia;
    }
}
