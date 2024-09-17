import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Invest!");

        while (true) {
            System.out.println("Selecione uma opção:\n" +
                    "[0] Sair\n" +
                    "[1] Criar conta\n" +
                    "[2] Accesar conta"
            );
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Volte sempre!");
                break;
            } else if (opcao == 1) {
                System.out.println("Digite o nome do titular:");
                String nomeTitular = scanner.next();

                var contaBancaria = new ContaBancaria(nomeTitular);

                System.out.println("Selecione uma opção:\n" +
                        "[0] Sair\n" +
                        "[1] Depositar\n" +
                        "[2] Sacar\n" +
                        "[3] Visualizar Saldo"
                );
                int opcaoConta = scanner.nextInt();

                if (opcaoConta == 0) break;
                else if (opcaoConta == 1) {
                    System.out.println("Digite o valor do deposito:");
                    double valorDeposito = scanner.nextDouble();

                    contaBancaria.depositar(valorDeposito);
                    contaBancaria.visualizarSaldo();
                }
            }
        }
    }
}
