/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamentoentreclasses;

import java.util.Random;

/**
 *
 * @author claud
 */
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }


    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Confronto confirmado: " + l1.getNome() + " X " + l2.getNome());
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Confronto Inválido!!");
        }
    }
    
    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("## Desafiado ##");
            this.desafiado.apresentar();
             System.out.println("## Desafiante ##");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3);
            System.out.println("== Resultado ==");
            switch(vencedor) {
                case 0: 
                    System.out.println("### Empatou ###");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1 :
                    System.out.println("### Vitória de " + this.desafiado.getNome() + "###");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("### Vitória de " + this.desafiante.getNome() + "###");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=======");
            
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
    
}
