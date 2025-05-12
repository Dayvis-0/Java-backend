package LiteralesCaracterString_6;
/*El lenguaje de programacion Java tambienn admite algunas secuencias de escape especiales para char y String literales*/
public class SecuenciasEscape {
    public static void main(String[] args) {
        // \b retroceso, l
        String retro = "hola\bmundo";
        
        System.out.println("Inserta un espacio de retroceso en el texto en este punto hola\\bmundo: " + retro);
    }
}