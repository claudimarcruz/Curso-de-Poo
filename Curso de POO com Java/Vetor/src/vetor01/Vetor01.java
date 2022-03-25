/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author claud
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // int n[] = {3, 2, 8, 7, 5, 4};
        
        /*for(int c=0; c<=n.length -1;c++){
            System.out.print(n[c]);
        }*/
        
        /*
        Arrays.sort(n);
        int pos = Arrays.binarySearch(n, 3);
        for(int valor: n){
            System.out.print(valor + "   ");
                
        }
        
        System.out.println("\n" + pos);*/
        
        int vetor[] = new int[20];
        Arrays.fill(vetor, 0);
        
        for(int valores:vetor){
            System.out.print(valores + "  ");
        }
            
    }    
    
}
