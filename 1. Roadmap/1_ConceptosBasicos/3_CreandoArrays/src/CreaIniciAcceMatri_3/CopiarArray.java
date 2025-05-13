package CreaIniciAcceMatri_3;
/*El sytem la clase tiene un arraycopy() metodo que puede usar para copiar datos de manera eficiente de una matriz a otra*/
public class CopiarArray {
    
    public static void main(String[] args) {
        String[] copyForm = {
            "Affogato", "America", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Expresso", "Frappuccino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto" };
        
        String[] copyTo = new String[7];
        
        System.arraycopy(copyForm, 2, copyTo, 0, 7);
        
        for (String coffe : copyTo) {
            System.out.println("\t" + coffe);
        }
    }
}