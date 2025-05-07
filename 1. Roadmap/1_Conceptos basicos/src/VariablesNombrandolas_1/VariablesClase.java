package VariablesNombrandolas_1;
/*Una variable de clase es cualquier campo declarado con el static modificador; esto le dice al compilador que existe 
exactamente una copia de esta variable, independientemente de cuantas veces se haya instanciado la clase.*/
public class VariablesClase {
    // Variable de clase (campo estatico)
    static int numbGears = 6;
    
    public static void showNumOfGears() {
        System.out.println("Numero de engranajes: " + numbGears);
    }
}