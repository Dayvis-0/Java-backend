package Nombramiento_2;

//Las Variables son sensibles a los casos
public class VariablesNombramiento {
    static final String DEFAULT_LANGUAGE = "EN";
    
    public static void main(String[] args) {
        // El nombre de la variable comenzar con una letra, el signo $, el caracter de subrayado _ ppor convencion se usa un letra
        String name = "Dayvis";
        // Por convecion el signo $, nunca se usa, en absolto
        // Si el nombre consta de una sola palabra, deletree esa palabra
        int speed;
        boolean ready;
        //Si consta de mas de una palabra, capitaliza la primera palabra cada palabra posterior
        boolean isRunning;
        // Si la variable almacena un valor constante, la convencion cambia ligeramente, capitalizando cada letra y seprando 
        //palabras posteriores con el caracter subrayado
        int NUM_GEARS = 1;
    
        System.out.println("Lenguaje por defecto: " + DEFAULT_LANGUAGE);
    }
}