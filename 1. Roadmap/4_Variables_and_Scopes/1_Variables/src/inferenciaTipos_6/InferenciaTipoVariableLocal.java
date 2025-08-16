package inferenciaTipos_6;
/*A partir de Java 10 es posible que el compilador de Java infier el tipo de una variable local observando que
tipo real que se asigna a la variable cuando se declara la variable. Esta mejora esta restringida a variables 
locales, indices en bucles for-each y variables locales declaradas en bucles for.*/
public class InferenciaTipoVariableLocal {
    public static void main(String[] args) {
       // Ejemplo de una cadena anterior a Java 10 declaracion de variable
       String myVar = "A string";
       // Ejemplo de una declaracion de una variable en Java 10 utilizando inferencia de tipo de variable local
       var myVar1 = "A string";
       
        System.out.println("a string before: " + myVar + " : " + myVar.getClass().getSimpleName());
        System.out.println("a strinf after: " + myVar1 + " : " + myVar1.getClass().getSimpleName());
    }
}
