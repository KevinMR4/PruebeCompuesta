package PruebCompuesta;
import java.util.Scanner;
/**
 *
 * @author KEVIN
 */
public class PruebaCompuesta {
    Scanner input = new Scanner(System.in);
    int nota;
    public void prueba(){
        System.out.print("Ingresa la calificación (1-10), presiona enter: ");
        nota=input.nextInt();
        switch (nota){
            case 10:
            case 9:
                System.out.println("Excelente");
                break;
            case 8:
            case 7:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Aprobado");
                break;
            case 5:
                System.out.println("EReprobado");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Suspendido");
                break;
            default:
                System.out.println("No es posible esta nota: ");
        }
        System.out.println("Fin del programa");
    }
    public static void main (String[]args){
        PruebaCompuesta prueb = new PruebaCompuesta();
        prueb.prueba();
    }
}
