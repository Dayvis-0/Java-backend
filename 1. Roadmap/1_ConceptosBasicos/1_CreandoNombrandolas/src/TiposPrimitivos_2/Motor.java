package TiposPrimitivos_2;
// Short
public class Motor {
    short revolu;
    
    void setRPM(short rpm) {
        if (rpm < 0 || rpm > 30000){
            throw new IllegalArgumentException("RPM fuera de rango");
        }
        this.revolu = rpm;
    }
}