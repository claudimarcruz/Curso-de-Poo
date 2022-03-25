/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author claud
 */
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    
    public void receberAumento(float aumento) {
        this.setSalario(this.getSalario() + aumento);
        System.out.println("O salário do professor " + this.getNome() + " recebeu uma aumento de " + 
                aumento + "R$ e passou para " + this.getSalario() + "R$");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
