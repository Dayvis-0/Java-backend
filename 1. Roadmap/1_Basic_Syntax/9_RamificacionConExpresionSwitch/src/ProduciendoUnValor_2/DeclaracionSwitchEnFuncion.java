package ProduciendoUnValor_2;
/*La sintaxis en el caso de un bloque de codigo es un poco diferente. Tradicionalmente, el return se utiliza para 
indicar ell valor producido por un bloque de codigo. Desafortunadamente, esta sintaxis genera ambiguedad en el
caso de la declaracion switch.*/
public class DeclaracionSwitchEnFuncion {
    // Esto no funciona
    /*public static String convertToLabel (int quarter) {
        String quarterLabel =  
            switch (quarter) {
                case 0 -> {
                    System.out.println("Q1 - Winter");
                    return "Q1 - Winter";
                }
                default -> "unknown quarter";
            };
        
        return quarterLabel;
    }*/
    // Si funciona
    public static String convertToLabel (int quarter) {
        String quarterLabel =  
            switch (quarter) {
                case 0 -> {
                    System.out.println("Q1 - Winter");
                    yield "Q1 - Winter";
                }
                default -> "unknown quarter";
            };
        
        return quarterLabel;
    }
    // Si funciona
    public static String convertToLabel1 (int quarter) {
        String quarterLabel =  
            switch (quarter) {
                case 0 -> "Q1 - Winter 1";
                default -> "Unknown quarter";
            };
        
        return quarterLabel;
    }
    
    public static void main(String[] args) {
        String convert = convertToLabel1(0);
        String convertYield= convertToLabel(0);
        /*La declaracion yield es una declaracion que se puede utilizar en cualquier case bloque de una
        declaracion switch. Viene con un valor, que se convierte en el valor del cierre de la declaracion switch*/
        
        System.out.println("The convert is: "  + convert);
        System.out.println("The convert is: "  + convertYield);
    }
}
