import java.util.ArrayList;
import java.util.List;
/*
4. Revertir una Lista
Objetivo: Escribir un programa que reciba una lista de cadenas de texto y la revierta.

Requisitos: Utiliza un bucle para invertir el orden de los elementos en la lista.
 */
public class RevertirLista {
    public static void main(String[] args) {
        List<String> valores = new ArrayList<>();
        List<String> valoresInvertidos = new ArrayList<>();

        valores.add("Adrian");
        valores.add("Carlos");
        valores.add("Jose");
        valores.add("Miguel");


        //Valores correctos
        System.out.println("Valores");
        valores.forEach(System.out::println);

        for (int i = 0; i < valores.toArray().length; i++) {
            valoresInvertidos.add(0, valores.get(i));

        }

        System.out.println("\nValores revertidos");
        valoresInvertidos.forEach(System.out::println);

    }
}
