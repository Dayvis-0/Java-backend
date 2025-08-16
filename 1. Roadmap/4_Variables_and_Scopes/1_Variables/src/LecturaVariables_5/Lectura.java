package LecturaVariables_5;
/*Se puede leer el valor de una variable Java escribiendo su nombre en cualquier lugar donde pueda estar una variable
o variable constante utilizado en el codigo. Por ejemplo, como lado derecho de una asignacion de variable, como 
parametro de una llamada a un metodo, o dentro de una expresion aritmetica.*/
public class Lectura {
    public static void main(String[] args) {
        float myFloat = 199.99f;
        float myFloat1 = myFloat;
        float myFloat2 = myFloat1 + 123.45f;
        
        System.out.println("My float: " + myFloat);
        System.out.println("My float 1: " + myFloat1);
        System.out.println("My float 2: " + myFloat2);
    }
}
