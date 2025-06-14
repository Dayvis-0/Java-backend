package Expresiones_1;
/*Una expresion es una construccion compuesta por variables, operadores e invocaciones de metodos*/
public class Expresiones {
    public static void main(String[] args) {
        int[] anArray = new int[1];
        int cadence = 0;
        anArray[0] = 100;
        int exp1 = 1 * 2 * 3;
        int exp2 = 2 + 3 / 100;
        // Puedes especificar exactamente como se evaluara una expresion utilizando parentesis equilibrados ()
        int exp3 = (2 + 3)/100;
        System.out.println("Element 1 at index 0: " + anArray[0]);
        System.out.println("Expresion compuesta: " + exp1);
        System.out.println("Expresion ambigua no recomendada: " + exp2);
        System.out.println("Expresion ambigua recomendada: " + exp3);
    }
}