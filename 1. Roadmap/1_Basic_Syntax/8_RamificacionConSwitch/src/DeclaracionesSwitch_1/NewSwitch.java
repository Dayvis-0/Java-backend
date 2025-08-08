package DeclaracionesSwitch_1;
/*La declaracion switch es una de las cinco declaraciones de control de flujo disponibles en en el lenguaje java. Permite
cualquier numero de rutas de ejecucion. La declaracion switch toma una variable selectora como argumento y utiliza
el valor de esta variable para elegir la ruta que se ejecutara:

vale la pena señalar que los siguientes tipos primitivos no se pueden utilizar para el tipo de su variable selectora: 
boolean, long, float, y double.*/
public class NewSwitch {
    public static void main(String[] args) {
        int quarter = 2;
        String quarterLabel = null;
        
        switch(quarter) {
            case 0: quarterLabel = "Q1 - Minter"; break;
            case 1: quarterLabel = "Q2 - Spring"; break;
            case 2: quarterLabel = "Q3 - Summer"; break;
            case 3: quarterLabel = "Q3 - Summer"; break;
            default: quarterLabel = "Unknow quarter";
        };
        
        System.out.println("The result is: " + quarterLabel);
        
        
    }
}
