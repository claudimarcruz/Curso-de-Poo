/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamento;

/**
 *
 * @author claud
 */
public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---MENU---");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <=this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true) {
            this.setVolume((this.getVolume() + 5));
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true) {
            this.setVolume((this.getVolume() - 5));
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if((this.getLigado() == true) && (this.getVolume() > 0)) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if((this.getLigado() == true) && (this.getVolume() == 0)) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if((this.getLigado() == true) && !(this.getTocando() == true)) {
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if((this.getLigado() == true) && (this.getTocando() == true)) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
    
    
    
    
}
