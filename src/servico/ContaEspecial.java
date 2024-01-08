package servico;

public class ContaEspecial extends ContaInvestimento {

   private int limiteChequeEspecial;
   private double tarifaMensal;

   public double getTarifaMensal() {
      return tarifaMensal;
   }

   public int getLimiteChequeEspecial() {
      return limiteChequeEspecial;
   }

   public void setLimiteChequeEspecial(int limiteChequeEspecial) {
      this.limiteChequeEspecial = limiteChequeEspecial;
   }

   public void setTarifaMensal(double tarifaMensal) {
      this.tarifaMensal = tarifaMensal;
   }

   public void debitarTarifaMensal(){

      double saldoAtual = (getSaldo() + limiteChequeEspecial) + getTarifaMensal();

   }
   public void imprimirDemonstrativo() {
      System.out.println();
      System.out.printf("Agência: %d%n", getAgencia());
      System.out.printf("domain.Conta: %d%n", getNumero());
      System.out.printf("domain.Titular: %s%n", getTitular().getNome());
      System.out.printf("Saldo: %.2f%n", getSaldo());
      System.out.printf("Valor Tarifa Mensal: %.2f%n" , tarifaMensal);
      System.out.printf("Limite Cheque Especial: %d%n" , limiteChequeEspecial);
      System.out.printf("Saldo Disponível: %.2f%n" ,  (limiteChequeEspecial + getSaldo() - tarifaMensal));
   }

}
