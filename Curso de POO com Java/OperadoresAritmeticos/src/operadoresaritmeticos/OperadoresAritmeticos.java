/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

import java.util.Random;

/**
 *
 * @author claud
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 5;
        int n2 = 3;
        float m = (n1 + n2) / 2;
        System.out.println("A média é " + m);*/
        
       /* int numero = 7;
        int valor = 8 + --numero;
        System.out.println(numero);
        System.out.println(valor);*/
       
       /*
       double exp= Math.pow(5, 2);
        System.out.println(exp);*/
       
       /*
       float v = 8.999f;
       int ar = (int)Math.floor(v);
        System.out.println(ar);*/
       
       /*double ale = Math.random();
       int n = (int) (0 + ale * (100 - 0));
       System.out.println(n);*/
       
       Random ale = new Random();
       
       int numero = ale.nextInt(100);
        System.out.println(numero);
        
    }
    
}
