package DeclaracionesSwitch_1;

import java.util.ArrayList;
import java.util.List;

/*El break evita el comportamiento de "caida" (fall-through). Es una herramienta esencial para asegurar que solo se ejecute
el bloque de codigo correspondiente al case que coincide con la expresion inical.*/
public class SwitchBreak {
    public static void main(String[] args) {
        int month = 2;
        List<String> futureMonth = new ArrayList<>();
        
        switch (month) {
            case 1: futureMonth.add("January");
            case 2: futureMonth.add("February");
            case 3: futureMonth.add("March");
            case 4: futureMonth.add("April");
            case 5: futureMonth.add("May");
            case 6: futureMonth.add("June");
            case 7: futureMonth.add("July");
            case 8: futureMonth.add("August");
            case 9: futureMonth.add("September");
            case 10: futureMonth.add("October");
            case 11: futureMonth.add("Nobember");
            case 12: futureMonth.add("December"); break;
            default: break;
        }
        
        System.out.println("The array is: " + futureMonth.toString());
        /*Se recomienda usar un break para que modificar el codigo sea mas facil y menos propenso a errores*/
    }
}
