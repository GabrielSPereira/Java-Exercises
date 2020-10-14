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
public class Imovel {
    protected String endereco;
    protected float preco;
    
    public Imovel() {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Endereço do imovél");    
        this.endereco = sc.nextLine();
        System.out.println("Preço do imovél");
        this.preco = sc.nextFloat();
        System.out.println("Digite 1 para Imóvel Novo ou 2 para Imóvel Velho");  
        if(sc.nextInt() == 1){
            Novo n = new Novo();
            n.setPreco();
            n.getPreco();
        }else if(sc.nextInt() == 2){    
            Velho v = new Velho();
            v.setPreco();
            v.getPreco();
        }else{
            System.out.println("Apenas 1 ou 2");  
        }
    }
}
