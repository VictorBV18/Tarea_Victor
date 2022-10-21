
package excepcion_tarea;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Raiz_Numero {

public static void main(String[] ar) {

        Scanner r = new Scanner(System.in);
        int num;
        boolean continua;
        do {
            try {
                continua = false;
                System.out.print("Ingrese un valor entero:");
                num = r.nextInt();
                float raiz = (float) Math.sqrt(num);
                System.out.print("La raiz de " + num + " es " + raiz);
            } catch (InputMismatchException x) {

                System.err.println("\tCaptura de la excepcion InputMismatchException");
                System.out.println("Debe ingresar obligatoriamente un número entero.");
                r.next();
                continua = true;
            }
        } while (continua);
    }
}

