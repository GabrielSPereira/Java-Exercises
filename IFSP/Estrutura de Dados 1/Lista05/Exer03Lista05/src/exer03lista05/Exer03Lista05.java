/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03lista05;

/**
 *
 * @author GABRIEL
 */
public class Exer03Lista05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Au au!");
        Gato g = new Gato("Miau!");
        Vaca v = new Vaca("Muuuu!");
        Leao l = new Leao("Roar!");
        Passaro p = new Passaro("Piuu!");
        c.imprime();
        g.imprime();
        v.imprime();
        l.imprime();
        p.imprime();                
    }
    
}
