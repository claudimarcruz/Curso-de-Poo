/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author claud
 */
public class Agencia {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void status () {
        System.out.println("-----------------------");
        System.out.println("Nome: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void Agencia() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public int getNumConta() {
        return numConta;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setSaldo(float saldo) {
        this.saldo= saldo;
    }
    
    public float getSaldo() {
        return saldo;
              
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public boolean getStatus() {
        return status;
    }
    
    public void abrirConta(String tipo) {
       this.setTipo(tipo); 
       this.setStatus(true);
       if( getTipo() == "CC") {
           this.setSaldo(50);
       }else if( getTipo() ==  "CP") {
           this.setSaldo(150);
       }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if ( this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada");
        }
    }
    
    public void depositar(float valor) {
        if(this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("A conta está fechada!");
        }
        
    }
    
    public void sacar(float saque) {
        if(this.getStatus() == true){
            if(this.getSaldo() >= saque) {
                this.setSaldo((this.getSaldo() - saque));
                System.out.println("Saque na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            } 
            
        } else {
            System.out.println("Impossível sacar");
        }
    }
    
    public void pagarMensal() {
        float mensal =0;
        
        if (this.getTipo() == "CC") {
            mensal = 12;
        } else if(this.getTipo() == "CP") {
            mensal =20;
        }
        
        if (this.getStatus() == true) {
            if (this.getSaldo() > mensal){
                this.setSaldo((this.getSaldo() - mensal ));
                System.out.println("Mensalidade pagar por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
                       
            }
        } else {
            System.out.println("impossível pagar");
        }
    }
    
}
