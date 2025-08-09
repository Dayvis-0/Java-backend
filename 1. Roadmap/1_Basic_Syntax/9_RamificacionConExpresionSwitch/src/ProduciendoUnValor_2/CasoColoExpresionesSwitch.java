package ProduciendoUnValor_2;
/*La expresion switch tambien puede utilizar una expresion tradicional case bloquear con case L:. En caso
este caso se aplica la semantica de caida. Los valores se obtienen utilizando la declaracion yield*/
public class CasoColoExpresionesSwitch {
    public static void main(String[] args) {
        int quarter = 1;
        String quarterLabel =
            switch (quarter) {
                case 0: yield "Q1 - Winter";
                case 1: yield "Q2 - Spring";
                case 2: yield "Q3 - Summer";
                case 3: yield "Q3 - Summer";
                default: 
                    System.out.println("Unknown quarter");
                    yield "Unknown quarter";
            };
        
        System.out.println("Yes " + quarterLabel);
    }
}
