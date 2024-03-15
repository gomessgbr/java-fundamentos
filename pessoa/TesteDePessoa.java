package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Professora professora = new Professora();
    professora.setCpf("123.456.789-00");
    professora.setIdade(20);
    professora.setNome("Joaquim");
    professora.setSalario(50000.00);

    System.out.println(professora.imprimirDadosDaPessoa());

    Aluno aluno = new Aluno();
    aluno.setCpf("102.456.789-10");
    aluno.setIdade(19);
    aluno.setNome("Enzo");
    aluno.setMatricula("123456");

    System.out.println(aluno.imprimirDadosDaPessoa());
  }

 
}
