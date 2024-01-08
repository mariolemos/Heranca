package desafio;

public class Funcionario {
    private String nome;
    private double valorHora;
    private Holerite holerite;

    public Funcionario(){
    }

    public Funcionario(String nome, double valorHora){
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValorHora(){
        return valorHora;
    }

  public Holerite getHolerite() {
        return holerite;
   }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrbalhadas){
        double salario = horasTrbalhadas * valorHora;
        return salario;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno){
        this.holerite = new Holerite(this.nome,mesAno, calcularSalario(horasTrabalhadas));
        return this.holerite;
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                ", holerite=" + holerite +
                '}';
    }
}
