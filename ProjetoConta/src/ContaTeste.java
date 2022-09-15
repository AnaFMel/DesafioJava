import java.util.Scanner;

public class ContaTeste {
    public static Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        do{
        System.out.println("-- Bem-vindo(a) à sua conta! --");
        System.out.println("1.Cadastrar");
        System.out.println("2.Depositar");
        System.out.println("3.Sacar");
        System.out.println("4.Consultar");
        System.out.println("5.Finalizar o processo");
        System.out.println("O que você deseja fazer?");
        escolha = Integer.parseInt(scanner.nextLine());
        switch (escolha) {
            case 1:
                execCadastrar();
                break;
            case 2:
                execDepositar();
                break;
            case 3:
                execSacar();
                break;
            case 4:
                execConsultar();
                break;
            case 5:
                System.out.println("Processo finalizado!");
                break;
            default:
                System.out.println("Número inválido!");
            }
        }
        while (escolha != 5);

    }

    public static void execCadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua conta: ");
        cc.setConta(scanner.nextLine());
        System.out.println("Insira a sua agência: ");
        cc.setAgencia(scanner.nextLine());
        System.out.println("Insira o seu saldo: ");
        cc.setSaldo(Double.parseDouble(scanner.nextLine()));
        System.out.println("Insira o seu nome: ");
        cc.setNomeCliente(scanner.nextLine());
    }

    public static void execDepositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do depósito: ");
        double deposito = Double.parseDouble(scanner.nextLine());
        cc.depositar(deposito);
    }
    public static void execSacar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do saque: ");
        double saque = Double.parseDouble(scanner.nextLine());
        int resultadoSaque = cc.sacar(saque);
        if (resultadoSaque == 1){
            System.out.println("Saque realizado!");
        } else if (resultadoSaque == 0) {
            System.out.println("Saque não realizado!");
        }
    }

    public static void execConsultar(){
        cc.imprimir();
    }

}
