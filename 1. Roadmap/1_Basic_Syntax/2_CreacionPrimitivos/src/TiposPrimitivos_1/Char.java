package TiposPrimitivos_1;
/*Unico caracter Unicode de 16bits
Valor: 
minimo -> \u0000 m
maximo -> \uffff
Permitidos
'a'-'z' | '0' | '#', '%' | '\n', '\t'*/

public class Char {
    public static void main(String[] args) {
        char letter = 'A';
        char symbol = '#';
        String unicode = "\u2764";
        
        System.out.println("Letra: " + letter);
        System.out.println("Simbolo: " + symbol);
        System.out.println("Unicode: " + unicode);
    }
}