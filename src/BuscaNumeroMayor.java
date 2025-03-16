/*
Buscar el Número Mayor en un Array
Objetivo: Escribir un programa que reciba un array de números enteros y devuelva el valor más grande.

Requisitos: Usa un bucle para recorrer el array y comparar los valores.
*/

public class BuscaNumeroMayor {
    public static void main(String[] args) {
        int[] numeros = new int[]{44, 455, 800, 77, 88, 99};
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    mayor = numeros[i];
                    numeros[j] = numeros[i];
                    numeros[j] = mayor;
                }
            }

        }
        System.out.println("Valor mayor del array = " + mayor);
    }
}
