package excepcion_operaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasePadre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public ClasePadre() {

    }

    //metodo que pide los valores al usuario 
    public void PedirDatos() {
       
            System.out.println("Ingrese el primer Valor:");
            valor1 = entrada.nextInt();
            System.out.println("Ingrese el segundo valor");
            valor2 = entrada.nextInt();

    }

    //metodo que muestra el resultado 
    public void MostrarResultados() {
            System.out.println(resultado);
        
     
    }
}
