import java.util.*;
/**
 * agostocincoDOSarray
 */
public class agostocincoDOSarray {

    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {

        int [] edades = new int[10];

        for (int i = 0; i < 10; i++)
        {
            System.out.println("Ingrese el número " + i);

            int numero;
            numero = Teclado.nextInt();

            edades[i] = numero;
        }

        int suma = 0;
        int prom = 0;

        for (int i = 0; i < 10; i++)
        {
            suma += edades[i];

        }
        prom = suma / 10;
        System.out.println("El promedio es " + prom);
        System.out.println("Edades recibidas");

        for (int i = 0; i < 10; i++)
        {
            System.out.println("edad  " + edades[i]);

        }
    }
}