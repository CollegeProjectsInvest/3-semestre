import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Array = tamanho estático
        /*
        int[] numerosInteiros = new int[3];
        numerosInteiros[0] = 10; // adicionar
        System.out.println(numerosInteiros[0]); // buscar

        String[] nomes = {"Marcos", "João", "Pedro"};

        nomes[3] = "Felipe"; // Erro
        System.out.println(nomes[3]);
         */

        // ArrayList = tamanho dinâmico
        // var nomes = new ArrayList<String>();
        /*
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionar
        nomes.add("Marcos");
        nomes.add("João");

        // Buscar
        System.out.println(nomes);
        System.out.println(nomes.get(0));
        System.out.println(nomes.indexOf("João")); // retorna o index do elemento
        System.out.println(nomes.contains("Pedro")); // false
        System.out.println(nomes.size()); // 2

        // Remover
        nomes.remove("Marcos");
        System.out.println(nomes);

        nomes.remove(0);
        System.out.println(nomes);

        // Loops no ArrayList
        nomes.add("Lucas");
        nomes.add("Maria");
        nomes.add("Felipe");

        // Array e ArrayList
        for (String nome : nomes) {
            System.out.println(nome);
        }
        */

        // HashMap
//         { "chave": "valor", "chave": "valor" }
        // var meuHashMap2 = new HashMap<String, String>();
        /*

        HashMap<String, String> meuHashMap = new HashMap<>();
        // Adicionando
        meuHashMap.put("chave1", "valor1");
        meuHashMap.put("chave2", "valor2");

        System.out.println(meuHashMap);

        // Buscar
        System.out.println(meuHashMap.get("chave1"));
        System.out.println(meuHashMap.containsKey("chave2"));

        // Remover
        meuHashMap.remove("chave1");
        System.out.println(meuHashMap);

        meuHashMap.clear();
        System.out.println(meuHashMap);

        // Loop no HashMap
        meuHashMap.put("chave1", "valor1");
        meuHashMap.put("chave2", "valor2");

        // Loop pelos valores
        for (String valores : meuHashMap.values()) {
            System.out.println(valores);
        }

        // Loop pelas chaves
        for (String chave : meuHashMap.keySet()) {
            System.out.println(chave);
        }
        */
    }
}
