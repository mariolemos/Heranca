package servico;

import domain.Conta;

public class ContaInvestimento extends Conta {

        private double rendimentos;

        public double creditarRendimentos(double taxa) {

                rendimentos = getSaldo() * taxa/100;

                return  rendimentos;
        }

        public void imprimirDemonstrativo() {
               // super.imprimirDemonstrativo();
                System.out.printf("Rendimento: %.2f%n", rendimentos);
                System.out.printf("Saldo Disponivel: %.2f%n", rendimentos + getSaldo());
        }
}
