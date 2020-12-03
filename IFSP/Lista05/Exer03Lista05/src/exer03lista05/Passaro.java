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
public class Passaro extends Animal {
    public Passaro(String Som){
        super(Som);
    }
    
    public void imprime(){
        System.out.println("Sou o Pássaro e faço " + this.Som);
    }
}
