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
public class Gerente extends Pessoa{
    protected String AreaGerenciamento;

    public String getAreaGerenciamento() {
        return this.AreaGerenciamento;
    }    
    
    public Gerente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Área de Gerenciamento:");    
        this.AreaGerenciamento = sc.nextLine();
        System.out.println("Seu Salário");
        this.Salario = sc.nextFloat();
    } 
    
    public void calculaImpostoGerente(){
        this.imposto = (float) (this.Salario * 0.05);
    }
    
    public void imprimeDadosGerente() {
        System.out.println("Nome do gerente: " + getNome());    
        System.out.println("Data de Nascimento do gerente: " + getDataNascimento());   
        System.out.println("Área de Gerenciamento do gerente: " + getAreaGerenciamento());   
        System.out.println("Salário do gerente: " + getSalario());    
        System.out.println("Imposto do gerente: " + getImposto());  
    }
}
