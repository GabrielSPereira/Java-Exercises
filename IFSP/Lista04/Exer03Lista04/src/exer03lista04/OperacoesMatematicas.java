package exer03lista04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GABRIEL
 */
public class OperacoesMatematicas {
    public void somar(int[] vet){
        int i, soma = 0;
        for(i = 0; i < vet.length; i++){
            soma += vet[i];
        }
        System.out.println("A soma é: " + soma);
    }
    
    public void subtrair(int n1, int n2){
        System.out.println("A subtração é: " + (n1 - n2));
    }
    
    public void multiplicar(int[] vet){
        int i, multiplica = 1;
        for(i = 0; i < vet.length; i++){
            multiplica *= vet[i];
        }
        System.out.println("A multiplicação é: " + multiplica);
    }
    
    public void dividir(int n1, int n2){
        System.out.println("A divisão é: " + (n1 / n2));
        if((n1 / n2) < 0){
            System.out.println("O módulo dessa divisão é: " + ((n1 / n2) * -1));
        }else{
            System.out.println("O módulo dessa divisão é: " + (n1 / n2));
        }
    }
}
