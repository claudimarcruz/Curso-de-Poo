/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author claud
 */
public class Peixe extends Animal {
    private String corEscama;
    
public void soltarBolha() {
    System.out.println("Soltando bolhas");
} 

    @Override
    public void locomover() {
        System.out.println("Nadando");    
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");    
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");    
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    


    
}
