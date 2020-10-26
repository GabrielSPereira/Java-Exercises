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
    private String descricao;
    private float valor;
    private boolean IsCredito;   
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public boolean getIsCredito(){
        return this.IsCredito;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public void setIsCredito(){
        this.IsCredito = !this.IsCredito;
    }
    
    public void Deposito(float quantia){
        valor += quantia;
    }
    
    public void Saque(float quantia){
        valor -= quantia;
    }
}
