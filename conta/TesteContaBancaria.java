package conta;

public class TesteContaBancaria {
  public static void main(String[] args) {
    ContaBancaria contaBancaria1 = new ContaBancaria();
    contaBancaria1.setNumero("123");
    contaBancaria1.setTitular("Joaquim");

    contaBancaria1.depositar(100);
    contaBancaria1.sacar(50);

  }
} 
