package PersonaSubesLiteralesNume_7;
/*Solo se puede colocar guines bajos entre guiones: no se puede colocar en los siguientes lugares:
Al principio o al final de un numero
Adyacente a un punto decimal en un punto literal
Antes de un F o L sufijo
En posiciones donde se espera una cadena de digitos*/
public class DondeColocarSubrayado {
    public static void main(String[] args) {
            // Invalidos 
        // float pi = 3_.1415F;
        // float pi = 3._1415F;
        // long socialNumber = 999_99_9999_L;
        
            // Valido
        int x1 = 5_2;
        // int x2 = 52_; invalido
        int x3 = 5______2;
        // int x4 = 0_x52; invalido
        // int x5 = 0x_52; invalido
        int x6 = 0x5_2; 
        // int x7 = 0x52_; invalido
        
        System.out.println("1. int: " + x1);
        System.out.println("2. int: " + x3);
        System.out.println("3. int: " + x6);
    }
}