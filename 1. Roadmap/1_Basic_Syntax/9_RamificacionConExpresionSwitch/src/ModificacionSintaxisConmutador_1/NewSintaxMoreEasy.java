package ModificacionSintaxisConmutador_1;

public class NewSintaxMoreEasy {
    public static enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        Day day = Day.THURSDAY;
        int len = 
            switch (day) {
                case MONDAY, FRIDAY, SUNDAY -> 6;
                case TUESDAY                 -> 7;
                case THURSDAY, SATURDAY      -> 8;
                case WEDNESDAY               -> 9;
        };
        /*La sintaxis de la etiqueta switch ahora es case L ->. Solo se ejecuta el codigo a la d*/
        
        System.out.println("len = " + len);
    }
}
