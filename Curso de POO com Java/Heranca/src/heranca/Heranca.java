/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;

/**
 *
 * @author claud
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Maria");
        p2.setNome("Bia");
        p3.setNome("Nat");
        p4.setNome("Jos");
        
        p4.setSexo("F");
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor(5);
        
        //p1.receberAum(550.20f);
        //p2.mudarTrabalho();
        //p4.cancelarMatr();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        
    }
    
}
