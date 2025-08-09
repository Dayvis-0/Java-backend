package ProduciendoUnValor_2;
/*La declaracion switch se puede utilizar como expresion.*/
public class DeclaracionSwitch {
    public static void main(String[] args) {
        int quarter = 1;
        String quarterLabel = 
            switch (quarter) {
                case 0 -> "Q1 - Winter";
                case 1 -> "Q2 - Spring";
                case 2 -> "Q3 - Summer";
                case 3 -> "Q3 - Summer";
                default -> "Unknown quarter";
            };
        
        System.out.println("Is -> " + quarterLabel);
    }
}
