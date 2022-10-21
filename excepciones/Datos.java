package excepciones;

import java.util.Scanner;

public class Datos {

    protected float base, altura, area, radio, pi=(float) 3.1416, operacion, arista;

    Scanner s = new Scanner(System.in);

    public Datos() {

    }

    //Pedir Datos Al Usuario 
    public void PedirDatos() {
        System.out.println("Ingrese el Valor de La Base:");
        base = s.nextInt();
        System.out.println("Ingrese el Valor de La Altura");
        altura = s.nextInt();

    }

    public void DatosCirculo() {
        System.out.println("Ingrese El Valor del Radio");
        radio = s.nextInt();

    }
    public void DatosCubo(){
    
        System.out.println("Ingrese El Valor de Las Aristas");
        arista= s.nextInt();
    }

    //Mostrar El Area
    public void area() {
        System.out.println(area);

    }

}
