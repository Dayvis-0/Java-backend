package DeclaracionIfThen_1;
/*Le dice a su programa que ejecute una cierta seccion de condigo solo si una prueba en particular se evalua true
*/
public class IfThen {
    static void applybrakes() {
        boolean isMoving = true;
        int currentSpeed = 0;
        if(isMoving) {
            currentSpeed--;
        }
        System.out.println("Velocidad actual: " + currentSpeed);
    }
    public static void main(String[] args) {
        applybrakes();
    }
}