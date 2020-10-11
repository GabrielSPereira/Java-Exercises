/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posaulapooaula6;

/**
 *
 * @author GABRIEL
 */
public class PosAulaPOOAula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora operacao1 = new Calculadora();
        operacao1.somar(4);
        operacao1.multiplicar(2);
        operacao1.imprime_resultante();
        
        CalculadoraCientifica operacao2 = new CalculadoraCientifica();
        operacao2.somar(10, 10);
        operacao2.subtrair(2);
        operacao2.multiplicar(2);
        operacao2.raiz();
        operacao2.imprime_resultante();
    }
    
}
