import java.util.Random;

public class ContaBancaria {
    public int numeroConta;
    public double saldo;
    public String nomeTitular;

    public ContaBancaria(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0;

        Random random = new Random();
        this.numeroConta = random.nextInt(1000, 1000000);
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
    }

    public void visualizarSaldo() {
        System.out.println("Titular: " + this.nomeTitular + "[" + this.numeroConta + "]");
        System.out.println("Seu saldo: R$" + this.saldo);
    }
}
