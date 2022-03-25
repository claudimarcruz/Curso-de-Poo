/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula9b;

/**
 *
 * @author claud
 */
public class Aula9B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("HTML", "Maria Candido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(299);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
    
}
