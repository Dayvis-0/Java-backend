package CreaIniciAcceMatri_3;

import java.util.Arrays;
/*Java SE proporciona metodos para realizar algunas de las manipulacionesmas comunes relacionadas con las matrices*/
public class ManipulacionArray {
    public static void main(String[] args) {
        String[] copyForm = {
            "Affogato", "America", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Expresso", "Frappuccino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto" };
        /*Copia el rango especificado de la matriz especificada en una nueva matriz 
        copyOfRnage(original, from, to)
        original -> la matriz desde la que se va a copiar un rango
        from -> el indice incial del rango a copiar, incluido
        to -> el indice final del rango copiar, exclusivo (este indice puede estar fuera de la matriz)*/
        String[] copyTo = Arrays.copyOfRange(copyForm, 2, 9);
        
        System.out.println("\tMetodo copyOfRange()");
        int cont = 0;
        // Una forma de mostrarlo
        for (String coffe : copyTo) {
            System.out.println(cont + ". " + coffe + " ");
            cont++;
        }
        // Otra forma de mostrarlo
        System.out.println(Arrays.toString(copyTo));
        System.out.println("\tMetodo binarySearch()");
        /*binarySearch(int[] a, a key int)
        Busca la matriz especificada de entradas para el valor especificado el algoritmo de busqueda binaria
        a -> la matriz a buscar
        key -> el valor a buscar*/
        int[] nume = {1,2,3,4,6};
        int indice = Arrays.binarySearch(nume, 3);
        
        System.out.println("Indice del 3: " + indice + " : Valor: " + nume[indice]);
                
        System.out.println("\tMetodo equals()");
        /*equals(int[] a, a int[] a2)
        Devuelve true si las dos matrices especificadas de entradas son igual a un al otro
        a -> una matriz para probar la igualdad
        a2 -> la otra matriz a probar para la igualdad*/
        int[] a = {1,2,3}; 
        int[] b = {1,2,3}; 
        
        System.out.println("El array a y b son iguales: " + Arrays.equals(a, b));
        
        System.out.println("\tMetodo fill()");
        /*fill(int[] a, a int val)
        Asigna el valor int especificado a cada elemento de la matriz especificada de entradas
        a -> la matriz a llenar 
        val -> el valor que se almacenara en todos los elementos de la matriz*/
        int[] nume1 = new int[5];
        Arrays.fill(nume1, 7);
        
        System.out.println("Array con puros 7: " + Arrays.toString(nume1));
        
        System.out.println("\tMetodo sort()");
        /*sort(int[] a)
        Ordena la matrriz especificada en orden numerico ascendente
        a -> la matriz a oordenar*/
        String[] letters = {"C","B","A"};
        Arrays.sort(letters);
        
        System.out.println(Arrays.toString(letters));
        
        System.out.println("\tMetodo parallelSort()");
        /*parallelSort(in[] a)
        Ordenar la matriz especificada en orden numerico ascendente
        a -> la matriz a ordenaes*/
        int[] nume2 = {1,200,2,4};
        Arrays.parallelSort(nume2);
        
        System.out.println(Arrays.toString(nume2));
        System.out.println("Siguiente");
    }
}