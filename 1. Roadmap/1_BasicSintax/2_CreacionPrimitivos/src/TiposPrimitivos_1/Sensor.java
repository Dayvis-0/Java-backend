package TiposPrimitivos_1;
// Byte ayuda a indicar que el rango es intencinalmente ilimitado
public class Sensor { 
    byte readingValue;
    
    void setValue(byte value) {
        if (value < -100 || value > 100) {
            throw new IllegalArgumentException("Valor fuera de rango permitido");
        }
        this.readingValue = value;
    }
}