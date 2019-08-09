import java.util.*;
/**
 * agostounoTRES
 */
public class agostounoTRES {

    private static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.println("Ingrese número de nota ");
        int numeroNota = Teclado.nextInt();

        switch (numeroNota) {
            case 10:
                System.out.println("Su calificación es A ");
                break;
            case 9:
                System.out.println("Su calificación es B");
            break;
            case 8:
                System.out.println("Su calificación es C");
            break;
            case 7:
            case 6:
                System.out.println("Su calicación es D");
            break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Su calicación es F");
            break; 
            default:
                System.out.println("Su calificación no es válida.");
                break;
        }
    }
}