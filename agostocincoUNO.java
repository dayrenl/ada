import java.util.*;
/**
 * agostocincoUNO
 */
    public class agostocincoUNO {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        int vocales = 0;
        int espacios = 0;
        int puntos = 0;
        char caracter;

        System.out.println("Ingrese oración carácter por carácter");
        caracter = Teclado.nextLine().charAt(0);

        while (caracter != '0') {
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                vocales = vocales++;   
                    break;
                case ' ':
                espacios = espacios++;
                    break;
                case '.':
                puntos = puntos++;
                default:
                    break;
            }
        System.out.println("Ingrese oración carácter por carácter");
        caracter = Teclado.nextLine().charAt(0);
        }
        System.out.println("Las cantidad de vocales es  " + vocales);
        System.out.println("La cantidad de espacios es " + espacios);
        System.out.println("La cantidad de puntos es " + puntos);
    }
}