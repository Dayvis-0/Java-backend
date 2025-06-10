package WhileDoWhile_3;

public class WhileDoWhile {
    public static void main(String[] args) {
        boolean expression = true;
        int nume = 0; 
        while(expression) {
            nume = nume + 1;
            System.out.println("Ahora: " + nume);
            if (nume == 5) {
                expression = false;
            }
        }
        System.out.println("");
        while (nume >= 0) {
            System.out.println("Otro: " + nume);
            nume--;
        }
        System.out.println("");
        do {
            System.out.println("Otro: " + nume);
            nume++;
        } while(nume < 5);
    }
}