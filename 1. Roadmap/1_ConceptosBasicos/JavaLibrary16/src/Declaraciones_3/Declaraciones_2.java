package Declaraciones_3;

public class Declaraciones_2 {
    // Declaracion de metodos
    public static int suma(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // Declaraciones de expresion -> Son instrucciones que realizan un accion y termina con;
        int x = 5;
        x++;
        System.out.println("Hola");
        System.out.println("Valor: " + Math.max(3,5));;
        // Declaracion de declaracion -> Se usan para variables, metodos o clases
        // Declaracion de variables (con tipos primitivos y objectos)
        int edad = 30;
        String nombre = "Ana";
        double PI = 3.1416;
        final int DIAS_SEMANA = 7; // constante
        System.out.println("Suma con un metodo: ");
        // Declaraciones de Flujo de Control 
        // Condicionales
        if(edad >= 18) {
            System.out.println("Mayor de edad");
        }
        else {
            System.out.println("Menor de edad");
        }
        // Bucles
        // Manejo de excepsiones
        try {
            int resu = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division de cero");
        } finally {
            System.out.println("Finalizado");
        }
    }
}
// Declaracion de clase 
class Persona { private String nombre; }