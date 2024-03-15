package construtor;

public class Construtor {
  /*
   * Como construir um construtor
   *  - Não possuí retorno
   *  - Precisa ter o mesmo nome da classe
   *  - Pode ser encapsulado ou não (public, private)
   *  - Pode ser vazio
   *  - Pode existir vários construtores, na hora de instanciar a classe, você decide qual usar
   *  - Toda vez que uma classe for criada sem um construtor, o Java já cria um vazio
   */
  
   private int numero;

  public Construtor(int numero){
    this.numero = 10;
  }

  public void setNumero(int numero){
    this.numero= numero;
  }

  public int getNumero(){
    return numero;
  }
}
