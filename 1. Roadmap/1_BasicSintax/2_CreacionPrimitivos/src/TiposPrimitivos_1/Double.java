package TiposPrimitivos_1;
/*Doble precision unica de 64bits
Su rango de valores esta mas alla de esta discusion
Rango: ±1.7×10³⁰⁸ (con 15-16 cifras decimales de precisión).*/
public class Double {
    public static void main(String[] args) {
        double pi = 3.141592653589793;
        double radio = 5.0;
        double area = pi * radio * radio;
        
        System.out.println("Area del circulo: " + area);
    }
}