/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posaulapooaula7;

import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Animal {
    protected String nome;
    protected String raca;
    
    public String getNome() {
        return this.nome;
    }    

    public String getRaca() {
        return this.raca;
    }

    public Animal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do animal");    
        this.nome = sc.nextLine();
        System.out.println("Raça do animal");
        this.raca = sc.nextLine();
    }

    public Animal(String nome) {
        this.nome = nome;
    }
    
    public String Caminha()
    {
        return("Está andando");
    }
    
    public void imprimeAnimal() {
        System.out.println("Nome do animal: " + getNome());    
        System.out.println("Raça do animal: " + getRaca());    
    }
}
