/*
João vitor S. C. Alarcon RA: 3466880
Lais B. Furtado RA:5446867
Thiago de Lima Oliveira RA: 1450320
Fabio T. L. Junior RA: 3205177
Victor H. B. Ribeiro RA: 3813617
John Wesley L. Oliveira RA: 3234028
*/
package sis_banco1;

public class Sis_Banco1 {

    public static void main(String[] args) {

        Criar_Conta conta = new Criar_Conta();
        
        Conta_Comum c1 = new Conta_Comum();
        c1.opcaoConta(1);
        conta.criaConta(c1);
        c1.imprimeDados();
        c1.sacar(0);
        c1.depositar(0);
        
        Conta_Poupança cp = new Conta_Poupança();
        cp.opcaoConta(2);
        conta.criaConta(cp);
        cp.imprimeDados();
        cp.sacar(0);
        cp.depositar(0);
        
        Conta_5_Estrelas c5e = new Conta_5_Estrelas();
        c5e.opcaoConta(3);
        conta.criaConta(c5e);
        c5e.imprimeDados();
        c5e.sacar(0);
        c5e.depositar(0);
        
       
    }
    
}
