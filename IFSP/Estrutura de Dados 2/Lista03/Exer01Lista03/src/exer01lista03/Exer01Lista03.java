/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista03;

/**
 *
 * @author GABRIEL
 */
public class Exer01Lista03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        
        conjunto.adicionar("Helena");
        conjunto.adicionar("Joanete");
        conjunto.adicionar("Joao");
        
        conjunto.remover("Joao");
        
        conjunto.todos().forEach((v) -> System.out.println(v));
        
        System.out.println("Há " + conjunto.tamanho() + " itens");
           
        Carro carro = new Carro();
        
        Associacao ass = new Associacao("111", carro);
    }
    
}
