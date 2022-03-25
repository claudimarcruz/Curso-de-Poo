/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosrepita;

import javax.swing.JOptionPane;

/**
 *
 * @author claud
 */
public class ExerciciosRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n, s=0, contTotal = 0, totalPares = 0, totalImpares = 0, maiorCem = 0; 
        float mediaValores;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <em>(0 para SAIR!)</em> </html>"));
            s += n;
            
            
            if(n > 100){
                maiorCem++;
            }
            
            if(n != 0){
                contTotal++;
            }
            
            if((n % 2 == 0) && (n > 0)){
                totalPares++;
            }
            
            if(n % 2 == 1) {
                totalImpares++;
            }
            
            
        } while(n!=0);
        
        mediaValores = (float)s / (float)contTotal;
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" +
                "<br>Média dos valores: " + mediaValores +
                "<br>Total de valores: " + contTotal +
                "<br>Total de pares: " + totalPares + 
                "<br>Total de impares: " + totalImpares +
                "<br>Acima de 100: " + maiorCem + "</html>");
        */
        
        int i;
        for(i=10 ; i >=0; i--){
            System.out.println(i);
        }
    }
    
}
