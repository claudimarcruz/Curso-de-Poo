/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author claud
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        
        m1.setPeso(85.3f);
        m1.setIdade(3);
        m1.setMembros(4);
        System.out.println(m1.toString());
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        
        System.out.println("\n\n");
        
        Canguru c1 = new Canguru();
        c1.setPeso(55.30f);
        c1.setIdade(3);
        c1.setMembros(4);
        System.out.println(c1.toString());
        c1.locomover();
        c1.alimentar();
        c1.emitirSom();
        c1.usarBolsa();
        
        Cachorro d1 = new Cachorro();
        d1.emitirSom();
        
       
        
        
    }
    
}
