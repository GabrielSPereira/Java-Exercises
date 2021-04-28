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
public class Sort {
    public void bubbleSort(int[] v) {
        int aux;
        
        for (int i = 0; i <= v.length; i++) {            
            for (int x = 0; x < v.length - 1; x++) {
                if (v[x + 1] < v[x]) {
                    aux = v[x];
                    
                    v[x] = v[x + 1];
                    v[x + 1] = aux;
                }
            }
        }
        
        System.out.println("BubbleSort: ");
        for (int value : v) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
    
    public void selectionSort(int[] v) {
        int index;
        int menor;
        
        for (int i = 0; i < v.length - 1; i++) {  
            index = i;
            
            for (int x = i + 1; x < v.length; x++) {  
                if (v[x] < v[index]){  
                    index = x;
                }
            }
            
            menor = v[index];
            
            v[index] = v[i];  
            v[i] = menor;  
        }
        
        System.out.println("SelectionSort: ");
        for (int value : v) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
    
    public void insertionSort(int[] v) {
        for (int j = 1; j < v.length; j++) {  
            int key = v[j];  
            int i = j-1;  
            
            while ((i > -1) && (v[i] > key)) {  
                v[i+1] = v[i];  
                i--;  
            } 
            
            v[i+1] = key;  
        }
        
        System.out.println("InsertionSort");
        for (int value : v) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
