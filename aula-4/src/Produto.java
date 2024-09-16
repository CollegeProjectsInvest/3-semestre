public class Produto {
    String nome;
    String codigo;
    double valor;

    // Construtor
    Produto(String nome, String codigo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    Produto(String nome) {}

    void cadastrar() {
        System.out.println("Cadastrado");
    }

    void visualizar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("Valor: " + this.valor);
    }

    // método
    static void metodoStatico() {
        System.out.println("Método estático");
    }
}
