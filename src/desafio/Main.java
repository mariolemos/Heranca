package desafio;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Mário Manoel Ferreira Lemos");
        funcionario.setValorHora(50);


        funcionario.gerarHolerite(50,"12/2023");

        Programador programador = new Programador("Wagner Cupertino Lemos",50,156);
        programador.gerarHolerite(50,"11/2023");



          System.out.println("Funcionario : " + funcionario.getNome());
          System.out.printf("Salario : %.2f:%n"  , funcionario.calcularSalario(50));
          System.out.println("Programador : " + programador.getNome());
          System.out.printf("Salario : %.2f:%n"  , programador.calcularSalario(50)) ;
          System.out.println(funcionario);
          System.out.println("******" + programador.getHolerite());

    }
}
