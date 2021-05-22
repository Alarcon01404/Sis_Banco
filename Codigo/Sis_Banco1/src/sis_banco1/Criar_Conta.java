
package sis_banco1;

import java.util.Scanner;

public class Criar_Conta {
    Scanner entrada_string = new Scanner(System.in);
     Scanner entrada_int = new Scanner(System.in);
     Scanner entrada_boolean = new Scanner(System.in);
     

     
    public void criaConta(Conta_Comum c1){
        System.out.println("Informe seu nome");
        c1.setNome(entrada_string.nextLine());
        System.out.println("Informe seu email");
        c1.setEmail(entrada_string.nextLine());
        System.out.println("Informe seu endereço");
        c1.setEnd(entrada_string.nextLine());
        System.out.println("Informe o ano de nacimento");
        c1.setAnonaci(entrada_int.nextInt());
        System.out.println("Informe o numero da conta");
        c1.setNumeroconta(entrada_int.nextInt());
        System.out.println("Informe seu cpf");
        c1.setCpf(entrada_boolean.nextBoolean());
    }
        public void criaConta(Conta_Poupança c1){
        System.out.println("Informe seu nome");
        c1.setNome(entrada_string.nextLine());
        System.out.println("Informe seu email");
        c1.setEmail(entrada_string.nextLine());
        System.out.println("Informe seu endereço");
        c1.setEnd(entrada_string.nextLine());
        System.out.println("Informe o ano de nacimento");
        c1.setAnonaci(entrada_int.nextInt());
        System.out.println("Informe o numero da conta");
        c1.setNumeroconta(entrada_int.nextInt());
        System.out.println("Informe seu cpf");
        c1.setCpf(entrada_boolean.nextBoolean());
    }
            public void criaConta(Conta_5_Estrelas c1){
        System.out.println("Informe seu nome");
        c1.setNome(entrada_string.nextLine());
        System.out.println("Informe seu email");
        c1.setEmail(entrada_string.nextLine());
        System.out.println("Informe seu endereço");
        c1.setEnd(entrada_string.nextLine());
        System.out.println("Informe o ano de nacimento");
        c1.setAnonaci(entrada_int.nextInt());
        System.out.println("Informe o numero da conta");
        c1.setNumeroconta(entrada_int.nextInt());
        System.out.println("Informe seu cpf");
        c1.setCpf(entrada_boolean.nextBoolean());
    }
    
}
