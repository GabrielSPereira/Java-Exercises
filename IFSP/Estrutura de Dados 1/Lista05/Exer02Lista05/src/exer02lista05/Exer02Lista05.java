/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02lista05;

/**
 *
 * @author GABRIEL
 */
public class Exer02Lista05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c = new Carro("G3X-1234");
        Bicicleta b = new Bicicleta("EVA-2434");
        Moto m = new Moto("EGA-1167");
        c.imprime();
        b.imprime();
        m.imprime();
    }
    
}
