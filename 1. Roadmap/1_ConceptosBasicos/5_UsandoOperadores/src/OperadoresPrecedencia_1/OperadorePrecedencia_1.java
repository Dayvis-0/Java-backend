package OperadoresPrecedencia_1;
/*Los operadores son simbolos especiales que realizan operaciones especificas en uno, dos o tres operandos
y luego devuelven un resultado

Los operadores se enumeran de acuerdo con el orden de precedencia*/
public class OperadorePrecedencia_1 {
    public static void main(String[] args) {
        System.out.println("\tOperadores    -   Precedencia");
        System.out.println("\n\tPostfijo      |   expr++ expr--");
        int a = 5;
        System.out.println("\tint a = "  + a);
        System.out.println("\t1. a++: " + a++ + " - a: " + a); 
        System.out.println("\t2. a--: " + a-- + " - a: " + a); 
        System.out.println("\n\tUnario      |   ++expr --expr +expr -expr ~ ! ");
        int c = 5, d = -c;
        boolean e = false;
        System.out.println("\tint c = " + c + " d: " + d + " | boolean e = " + e);
        System.out.println("\t1. ++c: " + ++c + " - c: " + c);
        System.out.println("\t2. --c: " + --c + " - c: " + c); 
        System.out.println("\t3. +c: " + +c + " - c: " + c);
        System.out.println("\t4. d: " + d + " - d: " + d);
        System.out.println("\t5. ~c: " + ~c + " - c: " + d);
        System.out.println("\t6. !d: " + !e + " - d: " + d);
        System.out.println("\n\tMultiplicativo      |   * / %");
        int f = 10, g = 3;
        System.out.println("\tint f = " + f + " g = " + g);
        System.out.println("\t1. f * g: " + f*g);
        System.out.println("\t2. f / g: " + f/g);
        System.out.println("\t3. f % g: " + f%g);
        System.out.println("\n\tAditivo     |   + -");
        int h = 1;
        int i = 2;
        System.out.println("\tint h = " + h + ", i = " + i);
        System.out.println("\t1. h + i: " + h+i);
        System.out.println("\t2. h + i: " + (h-i));
        System.out.println("\n\tCambio de bits     |   << >> >>>");
        int j = 8;
        System.out.println("\tint j = " + j);
        System.out.println("\t1. j << 1: " + (j<<1));
        System.out.println("\t2. j << 1: " + (j>>1));
        System.out.println("\t3. j << 1: " + (j>>>1));
        System.out.println("\n\tRelacional     |   < > <= >= instanceof");
        int k = 5, l = 10;
        System.out.println("\tint j = " + k + " l = " + l);
        System.out.println("\t1. k < l: " + (k<l));
        System.out.println("\t2. k >= l: " + (k>=l));
        System.out.println("\n\tIgualdad    |   == !=");
        int m = 5, n = 5;
        System.out.println("\tint m = " + m + " n = " + n);
        System.out.println("\t1. m == n: " + (m == n));
        System.out.println("\t2. m != n: " + (m != n));
        System.out.println("\n\tBitwise AND OR  |   & |");
        int ll = 5, o = 3;
        System.out.println("\tint ll = " + ll + " o = " + o);
        System.out.println("\t1. ll ^ o: " + (ll^o));
        System.out.println("\t2. ll | o: " + (ll|o));
        System.out.println("\n\tLogico AND OR  |   && ||");
        int p = 5, q = 10;
        System.out.println("\tint p = " + p + " q = " + q);
        System.out.println("\t1. p>q && q<p: " + (p>q && q<p));
        System.out.println("\t1. p>q || q<p: " + (p>q || q<p));
        System.out.println("\n\tTernario     |   ?:");
        int r = 5;
        System.out.println("\tint r = " + r);
        String resu = (r%2 ==0 )? "Es par" : "Es impar";
        System.out.println("\t1. r%2==0? " + resu);
        System.out.println("\n\tAsignacion     |   = += -= *= /= %= ^= &= |= <<= >>= >>>=");
        int s = 5;
        s += 3;
        System.out.println("\tint s = " + s);
        System.out.println("\t1. s+= " + s);
    }
}