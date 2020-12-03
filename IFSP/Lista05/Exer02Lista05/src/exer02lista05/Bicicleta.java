/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02lista05;

/**
 *
 * @author GABRIEL
 */
public class Bicicleta extends Veiculo{
    public Bicicleta(String Placa){
        super(Placa);
    }
    
    public void imprime(){
        System.out.println("Bicicleta de Placa: " + this.Placa);
    }
}
