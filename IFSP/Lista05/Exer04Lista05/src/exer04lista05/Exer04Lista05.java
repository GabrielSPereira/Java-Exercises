/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer04lista05;

/**
 *
 * @author GABRIEL
 */
public class Exer04Lista05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tv t = new Tv();
        t.imprime();
        t.inverteSituacao(1);
        t.imprime();
        
        Radio r = new Radio();
        r.imprime();
        r.inverteSituacao(2);
        r.inverteSituacao(2);
        r.imprime();        
    }
    
}
