package Variables_1;
/*Las variables locales solo son visibles para los metodos en los que se declaran; no son accesibles desde el resto de la clase*/

public class VariableLocal {
    public void speed() {
        int increase = 1;
        System.out.println("Acelerando: " + increase + " km/h");
    }
}