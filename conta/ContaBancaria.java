package conta;

public class ContaBancaria {
  private String numero;
  private String titular;
  private double saldo;

  // Constructor

 public ContaBancaria(){
  this.saldo = 0.0;
 }

  // Getters and Setters

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }



  // depositar
  void depositar (double valor){
    if(valor > 0){
      saldo= saldo+valor;
      System.out.println("Deposito: R$" + valor);
      System.out.println("Saldo atual: R$" + saldo);
    }else{
      System.out.println("O valor de deposito é inválido");
    }
  }


  //sacar

  void sacar(double valor){
    if(valor > 0 && valor <= saldo){
      saldo = saldo - valor;
      System.out.println("Saque: R$" + valor);
      System.out.println("Saldo atual: R$" + saldo);
    }else{
      System.out.println("Saldo insuficiente");
    }
  }
}
