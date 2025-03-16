/*
Promedio de los Elementos de un Array
Objetivo: Crear un programa que calcule el promedio de todos los elementos en un array de números enteros.

Requisitos: Recorre el array, suma los valores y divide entre el tamaño del array.
 */

public class PromediosElementosArray {
    public static void main(String[] args) {
        int[] numeros = new int[]{7,8,8,9,9,7,5,10};
        var promedio = 0;
        var suma = 0;
        for (int i = 0; i <numeros.length ; i++) {
            suma += numeros[i];
        }
        promedio = suma / numeros.length;
        System.out.println("Promedio: "+suma + " / " + numeros.length + " = "+ promedio);

    }
}
