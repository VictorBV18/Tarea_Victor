package excepcion_operaciones;

import java.util.InputMismatchException;

public class ClasePrincipal {

    public static void main(String[] args) {
            try{
            ClaseHija_Suma suma = new ClaseHija_Suma();
            suma.PedirDatos();
            suma.Sumar();
            System.out.println("El resultado de la suma es:");
            suma.MostrarResultados();

            ClaseHija_Resta resta = new ClaseHija_Resta();
            resta.PedirDatos();
            resta.Resta();
            System.out.println("\nEl resultado de la resta es:");
            resta.MostrarResultados();
            
            }catch(InputMismatchException ex){
            System.out.println("Aquí capturamos la excepción " + ex);
            System.out.println("Te solicitamos que ingresaras un valor de tipo entero :]h");
            }
    }

}
