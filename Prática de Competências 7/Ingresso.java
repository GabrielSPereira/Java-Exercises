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
public class Ingresso {
    protected float valor;
    
    public Ingresso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para Ingresso NORMAL ou 2 para Ingresso VIP");  
        if(sc.nextInt() == 1){
            System.out.println("Ingresso Normal");  
        }else if(sc.nextInt() == 2){
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior.");  
            if(sc.nextInt() == 1){
                System.out.println("Camarote superior");  
            }else if(sc.nextInt() == 2){
                System.out.println("Camarote inferior");  
            }else{
                System.out.println("Apenas 1 ou 2");  
            }        
        }else{
            System.out.println("Apenas 1 ou 2");  
        }
        System.out.println("Digite o Valor");  
        this.valor = sc.nextFloat();
    }
    
    public float getValor() {
        return this.valor;
    } 
    
    public void imprimeValor()
    {
        System.out.println("Valor do ingresso: R$ " + getValor());
    }
}
