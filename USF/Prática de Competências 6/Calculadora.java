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
public class Calculadora {
    public float resultante = 0;
    
    public float getResultante() {
        return resultante;
    }
    
    public void somar(float numero1, float numero2){
        this.resultante = numero1 + numero2;
    }
    
    public void somar(float numero1){
        this.resultante += numero1;
    }
    
    public void subtrair(float numero1, float numero2){
        this.resultante = numero1 - numero2;
    }
    
    public void subtrair(float numero1){
        this.resultante -= numero1;
    }
    
    public void multiplicar(float numero1, float numero2){
        this.resultante = numero1 * numero2;
    }
    
    public void multiplicar(float numero1){
        this.resultante *= numero1;
    }
    
    public void dividir(float numero1, float numero2){
        this.resultante = numero1 / numero2;
    }
    
    public void dividir(float numero1){
        this.resultante /= numero1;
    }
    
    public void imprime_resultante(){
        System.out.println("Resultado: " + getResultante());
    }
}
