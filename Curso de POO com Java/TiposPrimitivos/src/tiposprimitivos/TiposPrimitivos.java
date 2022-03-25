/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner EntradaDados = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String aluno = EntradaDados.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = EntradaDados.nextFloat();
        System.out.format("A nota da %s é %.2f \n",aluno,nota);
             
    }
    
}
