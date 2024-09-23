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

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> tasks = new ArrayList<>();

        String filePath = "src/tasks.txt";

        System.out.println("=== Gerenciamento de Tarefas ===");

        while (true) {
            System.out.println("Selecione uma opção:\n" +
                    "[0] Sair\n" +
                    "[1] Adicionar Tarefa\n" +
                    "[3] Listar Tarefas Salvas\n" +
                    "[4] Salvar Tarefas"
            )

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("=== Saindo... ===");
                break;
            }  else if (option == 2) {
                System.out.println("=== Adicionar Tarefa ===");

                System.out.println("Digite uma nova tarefa:");
                String task = scanner.nextLine();

                tasks.add(task);

                System.out.println("=== Tarefa [" + task + "] adicionada com sucesso ===");
            } else if (option == 2) {
                System.out.println("=== Listar Tarefas Salvas ===");

                try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("======================");
            } else if (option == 0) {
                System.out.println("=== Salvar Tarefas ===");

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
                    for (String task : tasks) {
                        bw.write(task);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("=== Tarefas salvas com sucesso ====");
            }
        }
    }
}
