package primeirasAulas;

import java.util.ArrayList;
import java.util.List;
public class EstruturadeDados {
  public static void main(String[] args) {
    // Lista
    List<String> nomes = new ArrayList<>();
    nomes.add("João");
    nomes.add("Maria");

    // System.out.println(nomes.get(1));

    // for(String nome : nomes){
    //   System.out.println("o nome é:" + nome);
    // }

    // nomes.forEach(nome -> System.out.println("o nome é:" + nome));
    nomes.forEach(System.out::println);

  }
}
