import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        // 4
        var scanner = new Scanner(System.in);

        var tarefas = new ArrayList<String>();

        while(true) {
            System.out.println("" +
                    "[0] Sair\n" +
                    "[1] Adicionar\n" +
                    "[2] Remover\n" +
                    "[3] Listar\n"
            );
            var option = scanner.nextInt();

            if (option == 0) break;

            switch(option) {
                case 1:
                    // Adicionar Tarefas
                    System.out.println("Digite uma tarefa:");
                    String tarefaAdicionar = scanner.next();

                    tarefas.add(tarefaAdicionar);
                    break;
                case 2:
                    // Remover Tarefas
                    System.out.println(
                            "Digite o index da tarefa para remover"
                    );
                    int indexTarefa = scanner.nextInt();

                    tarefas.remove(indexTarefa);
                    break;
                case 3:
                    // Listar todas as Tarefas
                    for (int i = 0; i <= tarefas.size() - 1; i++) {
                        System.out.println("[" + i + "]: " + tarefas.get(i));
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
