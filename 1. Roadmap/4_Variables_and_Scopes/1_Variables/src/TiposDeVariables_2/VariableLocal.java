package TiposDeVariables_2;
/*Una variable local es una variable declarada dentro de un metodo. Solo se puede acceder a una variable local
dentro del metodo que lo declaró.*/
public class VariableLocal {
    public void mostrar() {
        int numero = 3;
        System.out.println("Numero local: " + numero);
    }
    public static void main(String[] args) {
        new VariableLocal().mostrar();
    }
}