
package sis_banco1;

import java.util.Scanner;

public abstract class Conta {
   private int anonaci;
    private String end;
    private String nome;
    private String email;
   private int numeroconta;
    private boolean cpf;
   int saldo;
    int credio;

    public int getAnonaci() {
        return anonaci;
    }

    public void setAnonaci(int anonaci) {
        this.anonaci = anonaci;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public boolean isCpf() {
        return cpf;
    }

    public void setCpf(boolean cpf) {
        this.cpf = cpf;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCredio() {
        return credio;
    }

    public void setCredio(int credio) {
        this.credio = credio;
    }

    public Conta() {
    }

    public Conta(int anonaci, String end, String nome, String email, int numeroconta, boolean cpf, int saldo, int credio) {
        this.anonaci = anonaci;
        this.end = end;
        this.nome = nome;
        this.email = email;
        this.numeroconta = numeroconta;
        this.cpf = cpf;
        this.saldo = saldo;
        this.credio = credio;
    }
    



    public void imprimeDados(){
        System.out.println("Numero da conta"+getNumeroconta());
        System.out.println("Nom do usuario"+getNome());
        System.out.println("Saldo"+getSaldo());
        System.out.println("Credito disponivel"+getCredio());
    }
        public double sacar(double valor){
            Scanner entrada_double = new Scanner(System.in);
            System.out.println("Digite o valor a ser sacado");
            valor = entrada_double.nextDouble();
            if (valor<=this.saldo) {
                this.saldo=(int) (this.saldo-valor);
                System.out.println("O valor sacado foi R$"+valor);
            } else {
                System.out.println("Saldo indisponivel");
            }
            return valor;
        }
        public double depositar(double valor){
            this.saldo=(int) (this.saldo+valor);
            System.out.println("O valor depositado foi de R$"+valor);
             System.out.println("O total atual é de R$"+this.saldo);
             
       return 0;
        }
        public void opcaoConta(int credito){
            System.out.println("Digite 1 para Conta Comum");
             System.out.println("Digite 2 para Conta Poupança");
              System.out.println("Digite 3 para Conta 5 Estrelas");
              int escolherConta = entradaInt.nexInt();
              switch(escolherConta){
              case(1):
           credito = 100;
           saldo = saldo + credito;
           break;
               case(2):
               credito = 0;
               saldo = saldo + credito; 
               break;
               case(3):
                  credito = 500;
                  saldo = saldo + credito; 
                  break;
              }

        }
    }

