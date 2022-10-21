package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try{ Scanner s = new Scanner(System.in);
        int opcion;
        System.out.println("-------------------------------------SISTEMA INICIADO----------------------------------------------\n\n");
        System.out.println("Elige La FIGURA de la que quieras saber el [AREA]\n");
        System.out.println(" 1)Circulo\n 2)Cuadrado\n 3)Triangulo\n 4)ESFERA\n 5)CUBO\n 6)TETRAEDRO\n");

        System.out.println("\nA Continuacion Ingrese La OPCION:");
        opcion = s.nextInt();
        switch (opcion) {

            case 1:

                Circulo c = new Circulo();
                c.DatosCirculo();
                c.CalculoCirculo();
                System.out.println("El Area del Circulo Es:");
                c.area();

                break;
            case 2:
                Cuadrado cu = new Cuadrado();
                cu.PedirDatos();
                cu.CalculoCuadrado();
                System.out.println("El Area Del Cuadrado Es:");
                cu.area();

                break;
            case 3:
                Triangulo t = new Triangulo();
                t.PedirDatos();
                t.CalculoTriangulo();
                System.out.println("El Area Del Triangulo Es:");
                t.area();
                break;
            case 4:
                Esfera e = new Esfera();
                e.DatosCirculo();
                e.CalculoEsfera();
                System.out.println("El Area De La Esfera Es:");
                e.area();
                break;
            case 5:
                Cubo cub = new Cubo();
                cub.DatosCubo();
                cub.CalculoCubo();
                System.out.println("El Area De El Cubo Es:");
                cub.area();

                break;
            case 6:
                Tetraedro te = new Tetraedro();
                te.DatosCubo();
                te.CalculoTetraedro();
                System.out.println("El Area Del Tetraedro Es:");
                te.area();

                break;
            default:
                System.out.println("OPCION NO VALIDA");
                break;
        }

        System.out.println("-------------------------------------SISTEMA FINALIZADO----------------------------------------------\n\n");
        }catch(InputMismatchException ex){
            System.out.println("Aquí capturamos la excepción " + ex);
            System.out.println("Te solicitamos que ingresaras un valor de tipo entero");
        }
    }

}
