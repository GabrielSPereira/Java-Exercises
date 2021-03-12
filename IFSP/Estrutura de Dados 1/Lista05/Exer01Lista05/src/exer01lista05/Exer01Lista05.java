/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista05;

import exer01lista05.javateste.Diretor;

/**
 *
 * @author GABRIEL
 */
public class Exer01Lista05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a = new Aluno("Gabriel", 19);
        Professor p = new Professor("Eduardo", 33);
        TecnicoAdministrativo ta = new TecnicoAdministrativo("Galhardo", 23);
        Diretor d = new Diretor("Valéria", 63);
        a.quemSou();
        p.quemSou();
        ta.quemSou();
        d.quemSou();
    }
    
}
