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
public class Funcionario extends Pessoa{
    public Funcionario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seu Salário");
        this.Salario = sc.nextFloat();
    }
    
    public void calculaImpostoFuncionario(){
        this.imposto = (float) (this.Salario * 0.03);
    }
    
    public void imprimeDadosFuncionario() {
        System.out.println("Nome do funcionário: " + getNome());    
        System.out.println("Data de Nascimento do funcionário: " + getDataNascimento());   
        System.out.println("Salário do funcionário: " + getSalario());    
        System.out.println("Imposto do funcionário: " + getImposto());  
    }
}
