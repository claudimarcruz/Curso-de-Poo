/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author claud
 */
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista, desconto de " + this.getBolsa() + "%");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
