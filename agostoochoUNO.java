import java.util.*;
/**
 * agostoochoUNO
 */
public class agostoochoUNO {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int suma = 0;
         

        System.out.println("Ingrese cant números");
        n = Teclado.nextInt();

        boolean hay13=false;

        // declaro array de N posiciones
        int[] nros = new int[n];

        // recorro el array para llenarlo
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número");

            nros[i] = Teclado.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (nros[i] == 13) {
                hay13 = true;
            } else {
                if (!hay13) {

                    suma = suma + nros[i];
                } else {
                    hay13 = false;
                }
            }
        }
    System.out.println("La suma es " + suma);
    }
}