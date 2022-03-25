/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author claud
 */

// herança pra diferença, aluno é uma especialização de pessoa, e pessoa é uma generalização de aluno 
public class Aluno extends Pessoa { // se adicionar 'final' depois de public, essa classe não poderá ter filhos. 
    // o 'final' vale também para um método que não queira ser sobreposto 
    private int matricula;
    private String curso;
    
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
