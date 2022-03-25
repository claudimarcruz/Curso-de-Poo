/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author claud
 */
public class Cachorro extends Mamifero {
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }
    
}
