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
public class Pessoa {
    protected String nome;
    protected int idade;
    
    public String getNome() {
        return this.nome;
    }    

    public int getIdade() {
        return this.idade;
    }
    
    public Pessoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da pessoa");    
        this.nome = sc.nextLine();
        System.out.println("Idade da pessoa");
        this.idade = sc.nextInt();
    }
    
    public void imprimePessoa() {
        System.out.println("Nome da pessoa: " + getNome());    
        System.out.println("Idade da raça: " + getIdade());    
    }
}
