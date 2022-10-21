package excepciones;

public class Circulo extends Datos {

    public Circulo() {
        
    }

    public void CalculoCirculo() {
        operacion= (float) Math.pow(radio,2);
        area=operacion*pi;

    }

}
