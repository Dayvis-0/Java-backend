package PersonaSubesLiteralesNume_7;
/*En Java SE 7 y versiones posteriores, cualquier numero de caracteres de subrayado (_  )*/
public class CaracterSubrayado {
    public static void main(String[] args) {
        /*Por ejemplo: si el codigo contiene muchos numeros con munchos digitos
        se puede usar un caracter de subrayado para separar digitos en grupos de tres*/
        long creditCardNumber = 1234_5678_1235_3414L;
        long socialSecuryNumber = 999_99_9999L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_FC_DE_5E;
        long hexBytes1 = 0xCAFE_BABE;
        long maxLong = 0xfff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

        System.out.println("1. Tarjeda de credito: 1234_5678_1235_3414L - " + creditCardNumber);
        System.out.println("2. Numero de seguridad social: 999_99_9999L - " + socialSecuryNumber);
        System.out.println("3. Pi: 3.14_15F - " + pi);
        System.out.println("4. Hexabytes: 0xFF_FC_DE_5E - " + hexBytes);
        System.out.println("5. Hexabytes1: 0xCAFE_BABE - " + hexBytes1); 
        System.out.println("6. Largo maximo: 0xfff_ffff_ffff_ffffL - " + maxLong); 
        System.out.println("7. Mitad de un byte: 0b0010_0101 - " + nybbles); 
        System.out.println("8. Bytes: 0b11010010_01101001_10010100_10010010 - " + bytes); 
    }
}