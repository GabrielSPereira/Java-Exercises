/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03lista04;

/**
 *
 * @author GABRIEL
 */
public class Exer03Lista04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacoesMatematicas om = new OperacoesMatematicas();
        int[] vet = {1, 2, 3, 4};
        om.somar(vet);
        om.multiplicar(vet);
        om.dividir(-10, 5);
    }
    
}
