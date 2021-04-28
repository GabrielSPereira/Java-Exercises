/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista05;

/**
 *
 * @author GABRIEL
 */
public class Exer01Lista05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] v = {1, 5, 9, 2, 4, 6, 8, 0};
        
        Sort sort = new Sort();
        
        sort.bubbleSort(v);
        sort.selectionSort(v);
        sort.insertionSort(v);
    }
    
}
