package CreaIniciAcceMatri_3;
/*El sytem la clase tiene un arraycopy() metodo que puede usar para copiar datos de manera eficiente de una matriz a otra*/
public class CopiarArray {
    
    public static void main(String[] args) {
        String[] copyForm = {
            "Affogato", "America", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Expresso", "Frappuccino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto" };
        
        String[] copyTo = new String[7];
        /*Copia una matriz de la matriz de origen especificada, comenzando en el posicion especificada,
        hasta la posicion especificada de la matriz de destino
        arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        src -> la matriz de origen
        srcPos -> posicion incial en la matriz de origen
        dest -> la matriz de destino
        destPos -> posicion inicial en los datos de destino
        length -> el numero de elementos de matriz a copiar*/
        System.arraycopy(copyForm, 2, copyTo, 0, 7);
        
        for (String coffe : copyTo) {
            System.out.println("\t" + coffe);
        }
    }
}