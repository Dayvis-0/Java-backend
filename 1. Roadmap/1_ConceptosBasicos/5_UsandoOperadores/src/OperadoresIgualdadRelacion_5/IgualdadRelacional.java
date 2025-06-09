package OperadoresIgualdadRelacion_5;
/*La igualdad y los operadores relacionales determinan si un operando es mayor que, menor que, igual 
o no igual a otro operando*/
public class IgualdadRelacional {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }
}