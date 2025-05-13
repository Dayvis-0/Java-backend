package CreaIniciAcceMatri_3;

public class Array {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[3];
        
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        // Alternativamente, puede usar la sintaxis de acceso directo para crear e inicializa una matriz
        int[] anArray1 = {
            101, 201, 301,
            201,501, 601
        };
        
        System.out.println("\tArray uno\nElemento en el indice 0: " + anArray[0]);
        System.out.println("Elemento en el indice 1: " + anArray[1]);
        System.out.println("Elemento en el indice 2: " + anArray[2]);
        System.out.println("\tArray dos\nElemento en el indice 0: " + anArray1[0]);
        System.out.println("Elemento en el indice 1: " + anArray1[1]);
        System.out.println("Elemento en el indice 2: " + anArray1[2]);
    }
}