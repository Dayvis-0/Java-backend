package ModificacionSintaxisConmutador_1;
/*En Java SE 14 puedes utilizar otra sintaxismas conveniente para la palabra clave switch: la switch expresion
Varias cosas han motivado esta nueva sintaxis.
1. El comportamiento predeterminado del flujo de control entre las etiquetas del interruptor es fallar. Esta
sintaxis es propensa a errores y genera errores en las aplicaciones.
2. El bloque switch se trata como un solo bloque. Esto puede ser impedimento en el caso de que necesite 
definir una variable solo en un caso particular.
3. La declaracion switch es una declaracion. En los ejemplos de las secciones anteriores, a una variable se 
le asigna un valor en cada una case. Convertirlo en una expresión podría conducir a un código mejor y más legible*/
public class NewSintax {
    
    public static enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        int len = 0;
        
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                len = 6;
                break;
            case TUESDAY:
                len = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                len = 8;
                break;
            case WEDNESDAY:
                len = 9;
                break;
        }
        System.out.println("len = " + len);
    }
}
