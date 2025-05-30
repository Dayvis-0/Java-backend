package EjemplosConVar_2;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EjemplosVar {
    public static void main(String[] args) {
        var list = List.of("One","Two");
        for(var element: list) {
            System.out.println(element);
        }
    }
}