/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer05lista05;

/**
 *
 * @author GABRIEL
 */
public class Exer05Lista05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, "Gabriel", 500);
        cc.gerarTaxa();
        cc.getSaldo();
        cc.Depositar(500);
        cc.getSaldo();
        
        ContaPoupanca cp = new ContaPoupanca(2, "Beatriz", 700);
        cp.gerarTaxa();
        cp.Sacar(100);
        cp.getSaldo();
        cc.Transferir(cp, 200);
        cp.getSaldo();
        cc.getSaldo();
    }
    
}
