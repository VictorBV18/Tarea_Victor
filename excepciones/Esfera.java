
package excepciones;

public class Esfera extends Datos {

    public Esfera() {
        
    }

    public void CalculoEsfera() {
        operacion= (float) Math.pow(radio,2);
        
        
        area=4*(operacion*pi);

    }

}
