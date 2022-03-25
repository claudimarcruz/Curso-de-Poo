/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca2;

/**
 *
 * @author claud
 */
public class Heranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa p1 = new Pessoa(); // classe abstrata, o objeto não pode ser instanciado
       /* Visitante v1 = new Visitante();
        v1.setNome("Tati");
        v1.setIdade(22);
        v1.setSexo("M");
        v1.fazerAniversario();
        System.out.println(v1.toString());*/
       
       /*Aluno a1 = new Aluno();
       a1.setNome("Cláudio");
       a1.setMatricula(1000);
       a1.setCurso("Informática");
       a1.setIdade(16);
       a1.setSexo("M");
       a1.pagarMensalidade();
       //System.out.println(a1.toString());
       
       Bolsista b1 = new Bolsista();
       b1.setMatricula(1112);
       b1.setNome("Jubileu");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.pagarMensalidade();*/
       
       Professor p1 = new Professor();
       p1.setNome("Girafalez");
       p1.setEspecialidade("Portugês");
       p1.setSalario(3000f);
       p1.receberAumento(500f);
        
        
            
                
        
    }
    
}
