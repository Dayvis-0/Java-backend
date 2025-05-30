package LaPalabraClaveVar_1;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.InputStream;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

/*A partir de JAVA SE 10, puede utilizar el var escriba el identificador para declarar una variable
Al hacerlo deja que le compilador decida cual es el tipo de variable que crea
Una vez creado, este tipo no se puede cambiar*/
public class Var {
    public static void main(String[] args ) throws IOException {
        String message = "Hola mundo";
        Path path = Path.of("debug.log");
        
        if (!Files.exists(path)) {
            String content = "[INFO] Archivo creado automaticament\n";
            Files.writeString(path, content, StandardOpenOption.CREATE);
        }
        InputStream stream = Files.newInputStream(path);
        System.out.println(message);
        stream.close();
    }
}