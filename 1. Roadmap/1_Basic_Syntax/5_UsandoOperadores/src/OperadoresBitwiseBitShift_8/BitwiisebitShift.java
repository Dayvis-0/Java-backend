package OperadoresBitwiseBitShift_8;
/*El operador de complemento bit a bit ~  invierte un patron de bits; se puede aplicar a cualquiera de los tipos
integrales, haciendo que cada "0" se aun "1" y cada "1" un "0".
El bitwise & el operador realiza una operacion de AND bit a bit*/
public class BitwiisebitShift {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println(val & bitmask);
    }
}