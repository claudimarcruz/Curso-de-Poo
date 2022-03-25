/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparandostrings;

/**
 *
 * @author claud
 */
public class ComparandoStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Nat";
        String nome2 = new String("Nat");
        
        String res = (nome1.equals(nome2))? "igual":"diferente";
        System.out.println(res);
    }
    
}
