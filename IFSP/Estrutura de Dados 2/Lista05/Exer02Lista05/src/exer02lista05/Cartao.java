/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02lista05;

import java.util.Date;

/**
 *
 * @author GABRIEL
 */
public class Cartao {
    public String nomeCartao;
    public int numeroCartao;
    public Date dataExpiracao;
    
    public Cartao(String nomeCartao, int numeroCartao, Date dataExpiracao) {
        this.nomeCartao = nomeCartao;
        this.numeroCartao = numeroCartao;
        this.dataExpiracao = dataExpiracao;
    }
    
    public void Sort(Cartao[] cartoes) {
        Cartao cartaoTemp;

        for (int i = 0; i <= cartoes.length; i++) {            
            for (int x = 0; x < cartoes.length - 1; x++) {
                if (cartoes[x + 1].dataExpiracao.equals(cartoes[x].dataExpiracao)) {
                    if (cartoes[x + 1].numeroCartao < cartoes[x].numeroCartao) {
                        cartaoTemp = cartoes[x];
                    
                        cartoes[x] = cartoes[x + 1];
                        cartoes[x + 1] = cartaoTemp;
                        break;
                    }
                }
                
                if (cartoes[x + 1].dataExpiracao.before(cartoes[x].dataExpiracao)) {
                    cartaoTemp = cartoes[x];
                    
                    cartoes[x] = cartoes[x + 1];
                    cartoes[x + 1] = cartaoTemp;
                }
            }
        }
        
        for (Cartao c : cartoes) {
            System.out.println(c.nomeCartao);
        }
    }
}
