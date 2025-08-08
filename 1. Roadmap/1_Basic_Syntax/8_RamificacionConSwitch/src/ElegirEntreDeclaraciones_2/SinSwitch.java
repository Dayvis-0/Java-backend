package ElegirEntreDeclaraciones_2;
/*La declaracion "is-then-else" puede probar expresiones basadas en rangos de valores o condiciones*/
public class SinSwitch {
    public static void main(String[] args) {
        int temperature = 12;
        
        if(temperature < 0) {
            System.out.println("Water is ice");
        } else if (temperature < 100) {
            System.out.println("Water is liquid, known as water");
        } else {
            System.out.println("Water is vapor");
        }
    }
}
