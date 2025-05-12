package LiteralesCaracterString_6;
/*Los literales de tipos char y string puede contener caracter Unicode (UTF-16)
Siempre usar 'citas unicas' para char literales y "citas dobles" para String literales*/
public class LiteralesCaracterString {
    public static void main(String[] args) {
        // Literales char
        char letter = 'A';
        char unicode = '\u0108';
        
        // Literales String 
        String hello = "Hola mundo";
        String withUnico = "S\u00ED Se\u00F1or";
        
        System.out.println("Char normal: " + letter);
        System.out.println("Char unicode: " + unicode); 
        System.out.println("String: " + hello); 
        System.out.println("String unicode: " + withUnico); 
    }
}