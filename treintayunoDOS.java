import java.util.*;
/**
 * treintayunoDOS
 */
public class treintayunoDOS {
public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int valor;
        int numeroMax = 0;
        int posic = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("Ingrese valor");
            valor = Teclado.nextInt();
           
            if (valor > numeroMax) {
                numeroMax = valor;
                posic = posic + 1;
            } else {
                
            }
        }
        System.out.println("El valor máximo es " + numeroMax);
        System.out.println("La posición es " + posic);
    }
}