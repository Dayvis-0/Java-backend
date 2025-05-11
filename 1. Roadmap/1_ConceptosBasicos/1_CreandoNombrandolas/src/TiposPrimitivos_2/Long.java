package TiposPrimitivos_2;
/*Tipo entero con signo
Tmaño: 64 bits
Rango: 
minimo -> -2⁶³ = -9,223,372,036,854,775,808
maximo -> 2⁶³−1 = 9,223,372,036,854,775,807*/
public class Long {
    public static void main(String[] args) {
        long start_gala = 100_000L;
        long gala = 2_000_000L;
        
        long starGala = start_gala*gala;
        
        System.out.println("Estrellas totales estimadas: " + starGala);
    }
}