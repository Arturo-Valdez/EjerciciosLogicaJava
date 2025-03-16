/*
Suma de Elementos en un Array
Objetivo: Crear un programa que reciba un array de enteros y calcule la suma de todos sus elementos.

Requisitos: Usa un array de enteros y un bucle for para sumar todos los valores del array.
*/

public class SumaElementosArray {
    public static void main(String[] args) {
        int[] numeros = new int[]{4,5,6,7,4};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println(suma);
    }
}
