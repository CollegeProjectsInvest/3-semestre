import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         *  Preciso de um sistema para gerenciar e salvar tarefas, o sistema precisa de tais regras:
         *  - preciso ter as seguintes opções: sair, adicionar tarefa, listar tarefas salvas e salvar tarefas;
         *  - na opção de "sair" devo sair do programa;
         *  - na opção de "adicionar tarefa", o sistema deve perguntar o nome da tarefa a ser adicionada;
         *  - na opção de "listar tarefas salvas", o sistema deve listar todas as tarefas salvas em um arquivo .txt;
         *  - na opção de "salvar tarefas", o sistema deve pegar todas as tarefas que adicionei e salvar no arquivo .txt;
         *
         *  Desafio:
         *  - Corrija e teste o código para que todas as regras estejam funcionando corretamente;
         *  - Implemente boas práticas, como: criação de classes, divisão de responsabilidade e tratamento de erros;
         *  - Deixe o código claro/limpo, se necessário coloque comentários ou renomei variáveis e funções;
         *  - [Extra]: implemente uma opção de remover uma tarefa, caso o usuário queira remové-la antes de salvar todas as tarefas no .txt;
         */

        final String FILE_PATH = "src/tasks.txt";

        Scanner scanner = new Scanner(System.in);
        TXTManager txtManager = new TXTManager(FILE_PATH);

        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("=== Gerenciamento de Tarefas ===");

        while (true) {
            Menu.options();

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 0) {
                System.out.println("=== Saindo... ===");
                break;
            }  else if (option == 1) {
                System.out.println("=== Adicionar Tarefa ===");

                System.out.println("Digite uma nova tarefa:");
                String task = scanner.nextLine();

                tasks.add(task);

                System.out.println("=== Tarefa [" + task + "] adicionada com sucesso ===");
            } else if (option == 2) {
                System.out.println("=== Listar Tarefas Salvas ===");

                txtManager.list();

                System.out.println("======================");
            } else if (option == 3) {
                System.out.println("=== Salvar Tarefas ===");

                txtManager.save(tasks);
                tasks.clear();

                System.out.println("=== Tarefas salvas com sucesso ====");
            } else if (option == 4) {
                System.out.println("=== Remover Tarefa Salva ===");

                tasks = txtManager.list();

                System.out.println("Insira o nome da Tarefa a ser removida:");
                String task = scanner.nextLine();

                tasks.remove(task);

                txtManager.clear();
                txtManager.save(tasks);
            } else if (option == 5) {
                System.out.println("=== Limpar Tarefas Salvas ===");

                txtManager.clear();
            }
        }
    }
}
