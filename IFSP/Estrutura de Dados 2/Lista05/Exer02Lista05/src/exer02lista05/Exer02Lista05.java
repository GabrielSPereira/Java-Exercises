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
public class Exer02Lista05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date data = new Date();
        Date data2 = new Date(data.getTime() + 2 * 3600*1000);
        
        Cartao c1 = new Cartao("Cartao 01", 111, data2);
        Cartao c2 = new Cartao("Cartao 02", 222, data);
        Cartao c3 = new Cartao("Cartao 03", 333, data2);
        
        Cartao[] cartoes = {c1, c2, c3};
        
        c3.Sort(cartoes);        
    }
    
}
