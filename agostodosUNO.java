import java.util.*;
/**
 * agostodosUNO
 */
public class agostodosUNO {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int anio;
        System.out.println("Ingrese año");
        anio = Teclado.nextInt();
        boolean bisiesto;
        bisiesto = esBisiesto(anio);

        if (bisiesto) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
        private static boolean esBisiesto(int anio) {
            if (anio % 4 == 0 && 
                anio % 100 != 0 || anio % 400 == 0) {
            return true;
            } else {
            return false;
            }
        }   
}