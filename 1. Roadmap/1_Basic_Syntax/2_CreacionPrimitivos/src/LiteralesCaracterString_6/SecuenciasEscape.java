package LiteralesCaracterString_6;
/*El lenguaje de programacion Java tambienn admite algunas secuencias de escape especiales para char y String literales*/
public class SecuenciasEscape {
    public static void main(String[] args) {
        // \b, Inserte un espacio de retroceso en el texto en este punto 
        String retro = "Hola\bmundo";
        // \t Inserte una pestaña en el texto en este punto 
        String pest = "Hola\tmundo";
        // \n Inserte una nueva linea en el texto en este punto
        String new_line = "Hola\nmundo";
        // \r Inserte un retorno  de carro en el texto en este punto         
        String ins_return = "Hola\rmundo";
        // \f Inserte un feed de formulario en el texto en este punto
        String inst_feed = "Hola\fmundo";
        // \' Inserte un solo caracter de cita en el texto en este punto
        String ins_only = "Hola\'Mundo";
        // \'' Inserte un caracter de cita doble en el texto en este ounto
        String ins_double = "Hola\''Mundo";
        // \\ Inserte un caracter de barra diagonal inversa en el texto en este punto 
        String inst_barr = "Hola\\Mundo";
        
        System.out.println("1. Hola\\bmundo: " + retro);
        System.out.println("2. Hola\\tmundo: " + pest);
        System.out.println("3. Hola\\nmundo: " + new_line);
        System.out.println("4. Hola\\rmundo: " + ins_return);
        System.out.println("5. Hola\\fmundo: " + inst_feed);
        System.out.println("6. Hola\\'mundo: " + ins_only);
        System.out.println("7. Hola\\''mundo: " + ins_double);
        System.out.println("8. Hola\\mundo: " + inst_barr);
    }
}