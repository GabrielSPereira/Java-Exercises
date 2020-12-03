/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista05;

/**
 *
 * @author GABRIEL
 */
public class Professor extends Pessoa {
    public Professor(String Nome, int Idade){
        super(Nome, Idade);
    }
    
    public void quemSou(){
        System.out.println("Sou o Professor " + this.Nome + " com idade " + this.Idade);
    }
}
