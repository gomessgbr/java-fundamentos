package excecoes;

import pessoa.Pessoa;

// excecoes servem para lidar com erros

public class Excecoes {
  /*
   * Checked exceptions
   *  - O compilador do Java vai exigir que você trate esse tipo de execução
   */

  /*
   * Unchecked exceptions
   *  - Excecoes em que não se tem o controle, ou seja, normalmente feita pelo programador e o motor do java não consegue identificar.
   *  ex.: divisão por zero, nullpointerexception
   */

   public static void main(String[] args) {
    //try / catch
    /*
     * Uma das formas de tratar é usar o try / catch
     */
    // try{
    //   validarNumero();
    // }catch( Exception e){
    //   System.out.println("deu ruim, bolado!");
    //   /*
    //    * Metodo para exibir o erro como logs
    //    */
    //   e.printStackTrace();

    // }\

    // Unchecked exceptions NullPointerException
      Pessoa p = null;
      p.getCpf();

   }



   /*
   * Com static não preciso instanciar o metodo
   * Esse metodo(validarNumero) está fora do escopo da main
   * então seria necessário instanciar sem o static
   */
   
   
   public static void validarNumero() throws Exception{
    // CheckedException
    int numero = 10;
    if(numero<100){
      throw new Exception("O número é menor que 100");
    }
   }
}
