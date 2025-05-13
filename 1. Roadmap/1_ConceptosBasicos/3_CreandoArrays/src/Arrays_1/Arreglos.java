package Arrays_1;
/*Un Array es un objeto contenedor que contiene un numero fijo de valores de un solo tipo.
La longitud de una matriz se establece cuando se crea la matriz. Despues de la creacion su longitud es fija*/
public class Arreglos {
    public static void main(String[] args) {
        int[] anArray; // Declara una matriz de numeros enteros
        
        anArray = new int[10]; // Asigna memoria para 10 enteros
        
        anArray[0] = 100; // Inicializa el primer elemento...
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
        System.out.println("Elemento en el indide 0: " + anArray[0]);
        System.out.println("Elemento en el indide 1: " + anArray[1]);
        System.out.println("Elemento en el indide 2: " + anArray[2]);
        System.out.println("Elemento en el indide 3: " + anArray[3]);
        System.out.println("Elemento en el indide 4: " + anArray[4]);
        System.out.println("Elemento en el indide 5: " + anArray[5]);
        System.out.println("Elemento en el indide 6: " + anArray[6]);
        System.out.println("Elemento en el indide 7: " + anArray[7]);
        System.out.println("Elemento en el indide 8: " + anArray[8]);
        System.out.println("Elemento en el indide 9: " + anArray[9]);
    }
}