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
public class PosAulaPOOAula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("\nMenu Principal\n");
            System.out.println(" 1) Criar Gerente");
            System.out.println(" 2) Criar Funcionário");
            System.out.println(" 3) Criar Cliente");
            System.out.println(" 4) Sair do programa\n");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    Gerente g = new Gerente();
                    g.calculaImpostoGerente();
                    g.imprimeDadosGerente();
                    break;
                case 2:
                    Funcionario f = new Funcionario();
                    f.calculaImpostoFuncionario();
                    f.imprimeDadosFuncionario();
                    break;
                case 3:
                    Cliente c = new Cliente();
                    c.imprimeDadosCliente();
                    break;
                case 4:
                    System.out.println("Tenha um ótimo dia!");
                    break;
                default:       
                    System.out.println("Número errado");
                    break;
            }
        }while(menu != 4);
    }
    
}
