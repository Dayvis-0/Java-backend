package OperadoresUnarios_4;
/*Lo operadores unarios requieren solo un operando; realizan varias operaciones, como aumentar
diminuir un valor por uno, negar una expresion o invertir el valor de un booleano*/
public class Operador_unario_1 {
    public static void main(String[] args) {
        int result = +1;
        System.out.println(result);

        result--;
        System.out.println(result);

        result++;
        System.out.println(result);

        result = -result;
        System.out.println(result);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
    }
}