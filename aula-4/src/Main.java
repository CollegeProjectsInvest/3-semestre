import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.next();

        String codigoProduto = random.nextDouble(1000) + "";

        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        Produto produto = new Produto(nomeProduto);
        produto.visualizar();

        // método estático
        Produto.metodoStatico();
    }
}
