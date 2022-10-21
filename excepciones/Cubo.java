
package excepciones;

public class Cubo extends Datos {

    public Cubo() {
        
    }

    public void CalculoCubo() {
        operacion=(float) Math.pow(arista,2);
        area=operacion*6;

    }

}
