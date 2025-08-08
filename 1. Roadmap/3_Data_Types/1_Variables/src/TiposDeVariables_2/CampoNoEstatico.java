package TiposDeVariables_2;
/*Un campo no estatico es una variable que pertenece a un objeto. Los objetos mantienen su estado interno en campos
no estaticos. Los campos no estaticos tambien se denominan variables de instancia, porque pertenecen a instancias 
(objectos) de un clase*/
public class CampoNoEstatico {
    // Campo no estaticp
    String nombre;
    public CampoNoEstatico(String nombre) { this.nombre = nombre; }
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

class Test {
    public static void main(String[] args) {
        CampoNoEstatico p1 = new CampoNoEstatico("Ana");
        CampoNoEstatico p2 = new CampoNoEstatico("Juan");
        
        p1.saludar();
        p2.saludar();
    }
}
