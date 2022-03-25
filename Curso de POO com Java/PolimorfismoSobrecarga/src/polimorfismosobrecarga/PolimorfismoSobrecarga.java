/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismosobrecarga;

/**
 *
 * @author claud
 */
public class PolimorfismoSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Cachorro c1 = new Cachorro();
       c1.reagir("Olá");
       c1.reagir("Vai apanhar");
       c1.reagir(11, 45);
       c1.reagir(21, 00);
       c1.reagir(true);
       c1.reagir(false); 
       c1.reagir(2, 12.5f);
       c1.reagir(17, 4.5f);
       
    
    
    }
    
}
