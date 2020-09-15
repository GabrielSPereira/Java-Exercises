/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posaulapooaula2;

/**
 *
 * @author GABRIEL
 */
public class NovaBicicleta {
    int codigo;
    String modelo;
    String marca;
    int velocidade;
    int marcha;   
    int velocidade_maxima;
    
    void Nova_Bicicleta(){
        
    }
    
    void imprimir_Status(){
        
    }
    
    void Incrementar_Velocidade(int velocidade){
        this.velocidade += velocidade;
    }
    
    void Decrementar_Velocidade(){
        this.velocidade -= velocidade;
    }
    
    void Trocar_Marcha(int nova_marcha){
        marcha = nova_marcha;
    }
}
