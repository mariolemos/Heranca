package desafio;

public class Programador extends Funcionario{

    private double valorBonus;

    public Programador(String nome, double valorHora, double valorBonus) {
        super(nome, valorHora);
        this.valorBonus = valorBonus;
    }

    public double getValorBonus() {

        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    protected final double calcularSalario(int horasTrbalhadas){
       double valorSalario = super.calcularSalario(horasTrbalhadas) + valorBonus;
       return valorSalario;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "valorBonus=" + valorBonus +
                '}';
    }
}
