/*
Eliminar Duplicados en una Lista
Objetivo: Crear un programa que reciba una lista de enteros y elimine todos los elementos duplicados, devolviendo la lista sin repeticiones.

Requisitos: Utiliza un HashSet para garantizar que los elementos sean únicos.
 */

import java.util.HashSet;

public class EliminaDuplicadosLista {
    public static void main(String[] args) {
        HashSet<Integer> valores = new HashSet<>();
        valores.add(100);
        valores.add(100);
        valores.add(200);
        valores.add(300);
        valores.add(400);
        valores.add(400);

        System.out.println("Contenido del HashSet:");
        valores.forEach(System.out::println);



    }
}
