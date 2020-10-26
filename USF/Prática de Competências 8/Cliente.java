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
public class Cliente extends Pessoa{
    protected int codigo;
    
    public int getCodigo() {
        return this.codigo;
    }    
    
    public Cliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Código:");    
        this.codigo = sc.nextInt();
    }
    
    public void imprimeDadosCliente() {
        System.out.println("Nome do cliente: " + getNome());    
        System.out.println("Data de Nascimento do cliente: " + getDataNascimento());   
        System.out.println("Código do cliente: " + getCodigo());  
    }
}
