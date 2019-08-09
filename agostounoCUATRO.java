import java.util.*;
    /**
     * agostounoCUATRO
     */
    public class agostounoCUATRO {
    
    private static Scanner teclado;
   
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la medida en metros");
        double medidaMetros = teclado.nextDouble();
        double pulgadas = 0.0254;
        double medidaPulgadas;

        medidaPulgadas = medidaMetros / pulgadas;
        System.out.println("La medida es " + medidaPulgadas);

        }
    }
