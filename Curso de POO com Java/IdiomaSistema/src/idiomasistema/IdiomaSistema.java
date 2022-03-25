/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomasistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;


/**
 *
 * @author claud
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(idioma.getDisplayLanguage());
        
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension t = tela.getScreenSize();
        System.out.println("A resolução é: " + t.width + "X" + t.height);
        
    }
    
}
