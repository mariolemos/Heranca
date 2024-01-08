package domain;

public class Conta {

    public static final int NORMAL = 0;
    public static final int INVESTIMENTO = 1;
    public static final int ESPECIAL = 2;

    private Titular titular;
    private int agencia;
    private int numero;
    private  double saldo;
    private int tipo = NORMAL;


    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular){
        this.titular = titular;
    }

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void sacar(double valorSaque){
        if (valorSaque <= 0) {
            throw new RuntimeException("valor do saque deve ser maior que 0");
        }

        if(getTipo() != 2) {
            if (saldo < valorSaque) {
                throw new RuntimeException("Saldo insuficiente para saque");
            }
           // saldo -= valorSaque;
        }
        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito){
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }

        saldo += valorDeposito;

    }
    public void imprimirDemonstrativo() {
        System.out.println();;
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("domain.Conta: %d%n", getNumero());
        System.out.printf("domain.Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }



}
