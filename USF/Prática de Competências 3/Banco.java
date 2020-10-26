/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posaulapooaula2;

import java.util.ArrayList;

/**
 *
 * @author GABRIEL
 */
public class Banco {
    private int numero;
    private String nome;
    public ArrayList<ContaCorrente> contaCorrente;
    
    public int getNumero() {
        return numero;
    }    

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    void Criar_Contas(int numeroConta){
        ContaCorrente cc = new ContaCorrente(numeroConta);
        contaCorrente.add(cc);
    }
    void Excluir_Contas(int numeroConta){
        contaCorrente.remove(numeroConta);
    }
}
