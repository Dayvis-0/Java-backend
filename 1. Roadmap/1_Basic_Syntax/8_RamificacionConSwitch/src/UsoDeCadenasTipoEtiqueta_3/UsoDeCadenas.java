package UsoDeCadenasTipoEtiqueta_3;
/*El String en la expresion switch se compara con las expresiones asociadas con cada una etiqueta case como si la
String.equals() se estaba utilizando el metodo*/
public class UsoDeCadenas {
    public static void main(String[] args) {
        String month = "may";
        int monthNumber = -1;

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1; 
                break;
            case "february":
                monthNumber = 2; 
                break;
            case "march":
                monthNumber = 3; 
                break;
            case "april":
                monthNumber = 4; 
                break;
            case "may":
                monthNumber = 5; 
                break;
            case "june":
                monthNumber = 6; 
                break;
            case "july":
                monthNumber = 7; 
                break;
            case "august":
                monthNumber = 8; 
                break;
            case "september":
                monthNumber = 9; 
                break;
            case "october":
                monthNumber = 10; 
                break;
            case "november":
                monthNumber = 11; 
                break;
            case "december":
                monthNumber = 12; 
                break;
            default: monthNumber = 0; break;
        }
        
        System.out.println("El mes en numero es: " + monthNumber);
    }
}
