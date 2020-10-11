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
public class CalculadoraCientifica extends Calculadora{
    public void raiz(int numero1){
        this.resultante = (float) Math.sqrt(numero1);
    }
    
    public void raiz(){
        this.resultante = (float) Math.sqrt(this.resultante);
    }
    
    public void potenciacao(int base, int expoente){
        this.resultante = (float) Math.pow(base, expoente);
    } 
    
    public void potenciacao(int expoente){
        this.resultante = (float) Math.pow(this.resultante, expoente);
    } 
}
