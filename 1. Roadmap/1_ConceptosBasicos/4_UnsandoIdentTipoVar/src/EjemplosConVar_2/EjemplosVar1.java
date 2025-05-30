package EjemplosConVar_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjemplosVar1 {
    public static void main(String[] args) {
        var path = Path.of("debug.log");
        // Escribe Siempre el contenido, truncando si ya existe
        try {
                Files.writeString(path,"""
                        [INFO] Inicio del programa
                        [DEBUG] Procesando datos
                        [ERROR] Archivo no encontrado
                        [INFO] Finalizando ejecucion""");
                System.out.println("Archivo 'debug.log' creado con contenido de ejemplo");
            }
            catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
                return;
        }
        // Lectura del archivo linea por linea 
        try(var stream = Files.newInputStream(path)) {
            var reader = new BufferedReader(new InputStreamReader(stream));
            
            System.out.println("Contenido del archivo: ");
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());   
        }
    }
}