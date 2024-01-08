import domain.Conta;
import domain.Titular;
import servico.ContaEspecial;
import servico.ContaInvestimento;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Conta conta1 = new Conta();
       conta1.setTitular(new Titular("João da Silva", "12312312300"));
       conta1.setAgencia(1234);
       conta1.setNumero(999999);

       ContaInvestimento conta3 = new ContaInvestimento();
       conta3.setTitular(new Titular("Rodrigo Gomes", "28560043" +
               "8500"));
       conta3.depositar(2300);

        ContaEspecial conta2 = new ContaEspecial();

        //conta2.setLimite(1500);

       conta1.imprimirDemonstrativo();

       conta1.depositar(100);

       conta1.sacar(27.5);

      // conta3.calcularRendimento(12);

        conta1.imprimirDemonstrativo();

        conta3.imprimirDemonstrativo();

    }

}