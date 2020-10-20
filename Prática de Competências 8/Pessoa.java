/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posaulapooaula8;

import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected float Salario;
    protected float imposto;
    
    public String getNome() {
        return this.nome;
    }    

    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
    public Float getSalario() {
        return this.Salario;
    }
    
    public Float getImposto() {
        return this.imposto;
    }
    
    public Pessoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da pessoa");    
        this.nome = sc.nextLine();
        System.out.println("Data de Nascimento da pessoa");
        this.dataNascimento = sc.nextLine();        
    }

    public void imprimeDados() {
        System.out.println("Nome da pessoa: " + getNome());    
        System.out.println("Data de Nascimento da pessoa: " + getDataNascimento());    
        System.out.println("Imposto da pessoa: " + getImposto());    
    }
}
