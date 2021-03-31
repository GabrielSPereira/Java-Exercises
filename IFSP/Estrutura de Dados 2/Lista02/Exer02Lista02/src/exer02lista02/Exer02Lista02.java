/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02lista02;

/**
 *
 * @author GABRIEL
 */
public class Exer02Lista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        
        conjunto.adicionar("Gabriel");
        conjunto.adicionar("Henrique");
        conjunto.adicionar("Itanu");
        
        conjunto.remover("Henrique");
        
        conjunto.todos().forEach((v) -> System.out.println(v));
        
        System.out.println("Há " + conjunto.tamanho() + " itens");
           
        Carro carro = new Carro();
        
        Associacao ass = new Associacao("123", carro);
    }
    
}
