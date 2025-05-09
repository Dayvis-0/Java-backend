package TiposPrimitivos_2;
/* Representa un numero entero de 16 bits
Rango: -32 768 a 32 767*/
public class Short {
    public static void main(String[] args) {
        short temp = 12;
        /*No hacer esto
        short temp = 4000; Fuera de rango de short
        short tempm = 1000 + 2000; Error sin cast porque la suma es int*/
        short nume = (short)(1000 + 2000); // Cast necesario
        // Ahorro de memoria en arreglos grandes 
        short[] height = new short[100000];
        
        System.out.println("Temperatura registrada: " + temp);
        System.out.println("Suma de short: " + nume);
        
        // Uso como limite documentado
        Motor mo1 = new Motor();
        
        try {
            short rpm = 2500;
            mo1.setRPM(rpm);
            System.out.println("RPM configuradas correctamente 0");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        try {
            //short rpm = 35000; // Desborda el tipo short
            //mo1.setRPM(rpm);
            System.out.println("RPM configuradas correctamente 1");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}