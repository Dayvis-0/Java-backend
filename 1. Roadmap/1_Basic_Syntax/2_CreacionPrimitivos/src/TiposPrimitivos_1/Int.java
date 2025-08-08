package TiposPrimitivos_1;
/*Es un tipo de dato de 32bits
Minimo: -2^63 = -2 147 483 648
Maximo: 2^63-1 = 2 147 483 647*/
public class Int {
    public static void main(String[] args) {
        int popula = 1500000;
        int increase = 25000;
        int nume = 2147483647 + 1;
        
        int newPopula =  popula + increase;
        
        System.out.println("Poblacion actual: " + newPopula);
        System.out.println("Numero fuera: " + nume); // Rebote negatvo por desbordamiento
    }
}