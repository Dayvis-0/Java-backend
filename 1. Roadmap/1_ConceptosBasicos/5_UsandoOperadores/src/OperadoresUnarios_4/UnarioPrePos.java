package OperadoresUnarios_4;
/*Los operadores de icremento/disminucion se pueden aplicar antes(prefijo) o despues (postfijo) del operando
La unica diferencia es que la version prefijo (++result) se evalua al valor incrementado, mientras
que la version pstfijo (result++) se evalua al valor original*/
public class UnarioPrePos {
    public static void main(String[] args) {
        int i = 3;
        System.out.println(i++);
        System.out.println("Postfijo " + i);
        System.out.println(++i);
        System.out.println("Prefijo " + i);
        System.out.println("Prefijo " + ++i);
        System.out.println("Sufijo " + i++);
        System.out.println(i);
    }
}