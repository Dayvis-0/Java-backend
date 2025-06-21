package RestriccionesVar_3;
// 1. Solo puedes usarlo para variables locales declarando metodos, constructores y bloques inicializadores
public class Restriccion_1 {
    //private var name = "Sue"; // Error no se permite ver aqui
    public static void saludar() {// Se puede usar para declarar variables locales  
        var nombre = "Juan";
        System.out.println("Hola " + nombre);    
    }
    public static void main(String[] args) {
        // Permitido
        saludar();
    }
}