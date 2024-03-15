package pessoa;

public class Professora extends Pessoa{
  private double salario;

  public void setSalario(double valor){
    this.salario = valor;
  }

  public double getSalario(){
    return this.salario;
  }

  String imprimirDadosDaPessoa(){
    System.out.println(super.imprimirDadosDaPessoa());
    return " Você é professor" + salario;
  }
}
