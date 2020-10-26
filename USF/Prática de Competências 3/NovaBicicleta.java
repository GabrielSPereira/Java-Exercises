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
    public int codigo;
    public String modelo;
    private String marca;
    private int velocidade;
    private int marcha;   
    private int velocidade_maxima;
    
    public String getMarca() {
        return marca;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
    
    public int getMarcha() {
        return marcha;
    }
    
    public int getVelocidadeMaxima() {
        return velocidade_maxima;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setVelocidade(int velocidade) {
        if(velocidade < this.velocidade_maxima){
            this.velocidade = velocidade;
        }else{
            System.out.println("Acima de velocidade máxima");
        }
    }
    
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidade_maxima = velocidadeMaxima;
    }
    
    void Nova_Bicicleta(){
        
    }
    
    void imprimir_Status(){
        System.out.println(this.codigo);
        System.out.println(this.marca);
        System.out.println(this.marcha);
        System.out.println(this.modelo);
        System.out.println(this.velocidade);
        System.out.println(this.velocidade_maxima);
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
