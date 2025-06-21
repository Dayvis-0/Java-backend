package LiteralesIntegrales_4;
/*Valores de los tipos integrales byte, short, int, y long se puede crear a partir de int literales.*/
public class LiteralesIntegrales {
    public static void main(String[] args) {
        // Un literal entero es de tipo long si termina con la letra L o 1; de lo contrario es de tipo int;
        long large = 1223344L;
        // Los literales enteros  pueden expresarse mediante estos sistemas numericos;
        int decimValue = 26;
        int hexaValue = 0x1a;
        int binaryValue = 0b11010;
        
        System.out.println("Long: " + large);
        System.out.println("Decimal: " + decimValue);
        System.out.println("Hexadecimal: " + hexaValue);
        System.out.println("Binario: " + binaryValue);
    }
}