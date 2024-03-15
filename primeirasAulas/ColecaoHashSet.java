package primeirasAulas;
import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
  public static void main(String[] args) {
    // Coleção de elementos unicos, além de não ser ordenada, usar quando não importar a ordem
    // Não é possivel resgatar elementos pelo index
    Set<Integer> numeros= new HashSet<>();
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);
    numeros.add(13);

    // System.out.println(numeros.size());
    // for(Integer elemento: numeros){
    //   System.out.println(elemento);
    // }
    // numeros.remove(12);
      // Verifica se existe dentro do HashSet returna true ou false
    numeros.contains(12);

  }
}
