package TiposDeVariables_2;
/*Un campo estatico es una variable que pertenece a una clase. Un campo estatico tiene el mismo valor para todos 
los objetos que accede a el. Los campos estaticos tambien se denominan variables de clase.*/
public class CampoEstatico {
    // Campo estaticos
    static int totalObjectos = 0;
    public CampoEstatico() { totalObjectos++; }
    public static void mostrarTotal() {
        System.out.println("Totoal de objetos creados: " + totalObjectos);
    }
}

class Test {
    public static void main(String[] args) {
        new CampoEstatico();
        new CampoEstatico();
        
        CampoEstatico.mostrarTotal();
    }
}