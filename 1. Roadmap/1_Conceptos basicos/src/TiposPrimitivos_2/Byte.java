package TiposPrimitivos_2;
/*Representa un numero entero con signo de 8 bits
Rango: -128 a 127
Ocupa solo un byte de memoria (8 bits)*/
public class Byte {
    public static void main(String[] args) {
        byte age = 20; 
        byte[] pixelGrises = new byte[1024*768]; // Ahorro de memoria en matrices grandes
        
        System.out.println("Edad: " + age + ", Tipo de dato: byte");
        // Ayuda a indicar que el rango es intencionalmente ilimitado
        Sensor sen1 = new Sensor();
        
        try {
            sen1.setValue((byte) 150);
            System.out.println("Valor de lectura asignado correctamente");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Advertencias: Java promueve automaticamente los valore byte a int en operaciones matematicas
        byte a = 1, b = 2;
        
        byte sum = (byte)(a + b);
        System.out.println("Suma: " + sum);
    }
}