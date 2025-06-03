package Operadores_1;
/*Los operadores son simbolos especiales que realizan operaciones especificas en uno, dos o tres operandos
y luego devuelven un resultado

Los operadores se enumeran de acuerdo con el orden de precedencia*/
public class OperadorePrecedencia_1 {
    public static void main(String[] args) {
        System.out.println("\tOperadores    -   Precedencia");
        System.out.println("\tPostfijo      |   expr++ expr--");
        int a = 5;
        int b = ++a;
        System.out.println("\ta: " + a + " b: " + b); 
    }
}