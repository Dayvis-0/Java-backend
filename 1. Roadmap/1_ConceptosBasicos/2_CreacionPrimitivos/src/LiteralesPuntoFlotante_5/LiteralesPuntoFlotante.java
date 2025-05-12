package LiteralesPuntoFlotante_5;
/* Un literal de punto flotante es de tipo float si terminacon la letra F o f; de lo contrario su tipo
es double y opcinalmente puede terminar con la letra D o d.*/
public class LiteralesPuntoFlotante {
    public static void main(String[] args) {
        // Los tipos de punto flotante tambien se puede expresar usando E o e
        double d1 = 123.4;
        double d2 = 1.234e2; // D o d(64 bit double literal)
        float f1 = 123.4f; // F o f -> (32 bit float literal; valor predeterminado y por convencion)
        
        System.out.println("Double 1: " + d1);   
        System.out.println("Double 2: " + d2);   
        System.out.printf("Double 2 en notación científica: %.3e\n", d2);
        System.out.println("float: " + f1);   
        System.out.printf("f1 con 3 decimales: %.3f\n", f1);
    }
}