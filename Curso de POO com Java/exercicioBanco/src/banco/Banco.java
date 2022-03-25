/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author claud
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agencia ag1 = new Agencia();
        ag1.setDono("Ana");
        ag1.abrirConta("CC");
        ag1.getTipo();
        ag1.setNumConta(1000);
        ag1.setStatus(true);
        ag1.sacar(10);
        ag1.pagarMensal();
        ag1.depositar(2);
        ag1.sacar(30);
        ag1.fecharConta();
        ag1.status();
    }
    
}
