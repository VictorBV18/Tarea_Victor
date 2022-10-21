
package excepciones;

public class Tetraedro extends Datos {

    public Tetraedro() {
        
    }

    public void CalculoTetraedro() {
        operacion= (float) Math.pow(arista,2);
        area=(float) (operacion*Math.sqrt(3));

    }

}
