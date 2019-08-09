import java.util.*;
/**
 * agostoseisUNOarray
 */
public class agostoseisUNOarray {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Ingrese oración");
        String oracion = Teclado.nextLine();
        char cs[] = oracion.toCharArray();
 
        int vocales = 0;
        int espacios = 0;
        
        for (int i = 0; i < cs.length; i++) {
            if (esVocal(cs[i])) {
            vocales++;
            } else if (cs[i] == ' ') {
            espacios++;
            }
        }
        System.out.println("La cantidad de vocales es " + vocales);
        System.out.println("La cantidad de espacios " + espacios);
    }

    static boolean esVocal(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
    }
    

    
}