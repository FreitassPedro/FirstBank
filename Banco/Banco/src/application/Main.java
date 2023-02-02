package application;
import resources.Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Conta conta = new Conta(10, "Pedro", 1500, 1990);

         //IDENTIFICAÇÃO DO ID
        System.out.print("Digite o ID titular da conta: ");
        int ids = sc.nextInt();

        while (ids != conta.getId()) {
            System.out.println("Nenhum ID encontrado");
            System.out.println("Tente Novamente: ");
            ids = sc.nextInt();
        }
        //ÁREA DE LOGIN
        System.out.print("Este ID pertence à: " + conta.getNome() + ", Antes de começarmos, digite a senha da conta: ");
        int i;
        for (i = 4; i>0; i--) {
            int senha = sc.nextInt();
            if (senha != conta.getSenha() && i != 1) {
                System.out.println("Senha errada, voce tem mais " + (i - 1) + " tentativa(s): ");
                }
            else if (i == 1){
                System.out.println("Acesso bloqueado!");
                System.exit(0);
            }
            else{
                break;
            }
        }
        //COMEÇO DA INTERFACE DO USUARIO
        System.out.println();
        System.out.println("Boa Tarde, " + conta.getNome() + "!");
        System.out.println("O que deseja fazer primeiro?");
        System.out.println("1 -  Ver seu Saldo");
        System.out.println("2 -  Depositar");
        System.out.println("3-   Sacar");
        System.out.println("9 -  Encerrar sessão");
        byte resposta = sc.nextByte();

        //REPETIÇÃO DA INTERFACE
        while (resposta != sair) {
         if (resposta == 1) {
             System.out.println();
            System.out.println("Saldo: R$" + conta.getSaldo());
             System.out.println();
        }
        else if (resposta == 2) {
            System.out.println("Informe o valor a ser depositado");
            conta.addSaldo(sc.nextInt());
             System.out.println("Saldo atualizado! ");
             System.out.println();
        }
        else if (resposta == 3) {
             System.out.println("Possuimos uma política de saque taxa de R$ 2,00.");
             System.out.println("Desejar prosseguir?");
             char r = sc.next().charAt(0);
             if (r == 's') {
                 System.out.println("Informe o valor a ser sacado");
                 conta.removeSaldo(sc.nextInt() + 2);
                 System.out.println("Saldo atualizado! ");
                 System.out.println();
             }
        }
             else if (resposta == 9) {
            break;
             }
         else if (resposta >= 4) {
             System.out.println("Não entendi, tente outra vez:");
         }
         
        else {
        }
            System.out.println("Para continuar, tecle: ");
            System.out.println("1 -  Ver saldo");
            System.out.println("2 -  Depositar");
            System.out.println("3-   Sacar");
            System.out.println("9 -  Encerrar sessão");
            System.out.println();
        resposta = sc.nextByte();
        }
        //AO DIGITAR 4, SAI FORA DO LOOPING DO FOR E CAI NA SAIDA DO SISTEMA.
        System.out.println("Desconectado, tenha uma boa semana!");
        System.exit(0);
        sc.close();
    }
}
