/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posaulapooaula2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author GABRIEL
 */
public class ContaCorrente {
    private int numero;
    private float saldo;
    private boolean status;
    private float limite;
    public ArrayList<Movimentacao> movimentacao;        
    
    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public float getLimite() {
        return limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus() {
        this.status = !this.status;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    public void Altera_Status(boolean status){
        this.status = !this.status;
    }
    
    public void Altera_Limites(float limite){
        this.limite = limite;
    }
    
    ContaCorrente(int numero)
    {
        this.numero = numero;
        this.saldo = 0;
        this.status = true;
        movimentacao = new ArrayList();
    }
    
    public void movimenta(float valor, String tipo){
        Movimentacao m = new Movimentacao();        
        if(tipo.equals("Saque"))
        {
            if(saldo < valor)
            {
                System.out.println("Saldo insuficiente.");
            }
            else{
            m.Saque(valor);
            this.saldo = this.saldo - valor;
            movimentacao.add(m);
        }
        }
        if(tipo.equals("Deposito"))
        {
            m.Deposito(valor);
            this.saldo = this.saldo + valor;
            movimentacao.add(m);
        }
    }
    
    public float Mostra_Saldo(){
        return saldo;
    }
    
    public void Extrato(){
        Iterator<Movimentacao> iterator = movimentacao.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().getDescricao());
            System.out.println(iterator.next().getIsCredito());
            System.out.println(iterator.next().getValor());
            System.out.println("------------------------");
            System.out.println(this.saldo);
        }
    }
}
