package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
  public static void main(String[] args) {
    // O map não aceita tipos primitivos
    Map<String, Integer> notas = new HashMap<>();
    notas.put("Gabriel", 10);
    notas.put("Nicolly", 5);
    notas.put("Marcos", 8);
    notas.put("Maria",5);
    // Assim como no javascript, vai aparecer apenas o último valor setado, pq as chaves são iguais
    notas.put("Maria",7);
    // System.out.println(notas.get("Gabriel"));
    // System.out.println(notas.get("Nicolly"));

    // System.out.println(notas.keySet());
    // System.out.println(notas.values());
    // System.out.println(notas.entrySet());
    // System.out.println(notas);

    for(String nome : notas.keySet()){
      System.out.println(nome + " - " + notas.get(nome));
    }

    // for(Map.Entry<String, Integer> entry : notas.entrySet()){
    //   System.out.println(entry.getKey() + " - " + entry.getValue());
    // }
  }
}
