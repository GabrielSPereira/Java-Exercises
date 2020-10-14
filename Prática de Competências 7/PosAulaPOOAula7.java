/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posaulapooaula7;

/**
 *
 * @author GABRIEL
 */
public class PosAulaPOOAula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        System.out.println(c.Caminha());
        System.out.println(c.late());
        c.imprimeAnimal();
        
        Gato g = new Gato();
        System.out.println(g.Caminha());
        System.out.println(g.mia());
        c.imprimeAnimal();
        
        Pobre p = new Pobre();
        System.out.println(p.trabalha());
        p.imprimePessoa();
        
        VIP i = new VIP();
        i.setValor();
        i.imprimeValor();      
        
        Velho v = new Velho();
        v.setPreco();
        System.out.println("Preço do Imovél" + v.getPreco());
        
        CamaroteSuperior cs = new CamaroteSuperior();
        cs.getValor();
        
        Imovel im = new Imovel();
    }    
}
