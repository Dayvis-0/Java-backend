package RestriccionesVar_3;
/*En java compilador debe poder elegir un tipo cuando se declara la variable. Desde null no tiene tipo, 
la variable debe tener un inicializador*/

/*El compilador no puede adivinar el tipo real de la variable var sin inicializar
 Asi que este codigo no compila por eso*/
public class Restriccion_3 {
    public static String saludo(String name) {
        //var name;   // Error de compilacoin
        String rta = "Hola " + name;
        return rta;
    }
    
    public static void main(String[] args) {
        saludo("Juan");
    }
}