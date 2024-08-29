import java.util.Random;
import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        // 2)
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um número:");
//        int primeiroNumero = scanner.nextInt();
//
//        System.out.println("Digite outro número:");
//        int segundoNumero = scanner.nextInt();
//
//        System.out.println("Digite uma operação: (+, -, *, /)");
//        char operacao = scanner.next().charAt(0);
//
//        if (operacao == '/' && segundoNumero == 0) {
//            System.out.println("Não é possível fazer divisão por zero.");
//            return;
//        }
//
//        switch (operacao) {
//            case '+' -> System.out.println(
//                    "Adição: " + (primeiroNumero + segundoNumero)
//            );
//            case '-' -> System.out.println(
//                    "Subtração: " + (primeiroNumero - segundoNumero)
//            );
//            case '*' -> System.out.println(
//                    "Multiplicação: " + (primeiroNumero * segundoNumero)
//            );
//            case '/' -> System.out.println(
//                    "Divisão: " + (primeiroNumero / segundoNumero)
//            );
//            default -> System.out.println("Operação inválida");
//        }

        // 3)
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite sua nota:");
//        int nota = scanner.nextInt();

//        System.out.println(nota >= 7 ? "Aprovado" : nota < 4 ? "Reprovado" : "Recuperação");

//        if (nota >= 7) {
//            System.out.println("Aprovado!");
//        } else if (nota < 4) {
//            System.out.println("Reprovado");
//        } else {
//            System.out.println("Recuperação");
//        }

        // 4)
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um valor:");
//        int valor = scanner.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " x " + valor + " = " + (valor * i));
//        }

        // 5)
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Número aleatório 0 à 100
        int numeroAleatorio = random.nextInt(101);

        int numeroTentativas = 0;

        while (true) {
            System.out.println("Digite uma tentativa:");
            int tentativa = scanner.nextInt();

            numeroTentativas++;

            if (numeroTentativas >= 10) {
                System.out.println("Número tentativas excedeu!");
                break;
            }

            if (numeroAleatorio == tentativa) {
                System.out.println("Você acertou! " + numeroAleatorio);
                break;
            } else if (numeroAleatorio > tentativa) {
                System.out.println("O número é maior.");
            } else if (numeroAleatorio < tentativa) {
                System.out.println("O número é menor.");
            }
        }

        System.out.println("Número de tentativas: " + numeroTentativas);
    }
}
