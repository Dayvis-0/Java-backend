package OperadoreCondicionales_6;
/*El && y || los operadores realizan operaciones Condicional-AND y Condicional-OR en dos expresiones booleanas
Estos operadores exhiben un comportamiento "cortocircuito", lo que significa que el segundo operando se evalua 
solo si es necesario*/
public class Condicional {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if ((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if ((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}