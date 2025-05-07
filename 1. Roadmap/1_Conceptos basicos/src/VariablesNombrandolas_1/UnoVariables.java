package VariablesNombrandolas_1;

public class UnoVariables {
        
    public static void main(String[] args) {
        // Variables de instancia
        VariablesInstancia bici1 = new VariablesInstancia(10);
        VariablesInstancia bici2 = new VariablesInstancia(20);
        
        bici1.speed(5);
        
        bici1.showSpeed(); // La velocidad cambia, ya que se le aumento 5
        bici2.showSpeed(); //  La velocidad no cambia, ya que no se le aumento nada
        // A esto se le llama variable de instancia, porque sus valores son unicos en cada instancia
        
        // Variables de clase
        VariablesClase.showNumOfGears(); // No es necesaio crear una instancia, ya que pertenece a la clase
        
        // Variable local
        VariableLocal bici3 = new VariableLocal();
        
        bici3.speed();
        //System.out.println(increase); Error: no es visible aqui
    }
}