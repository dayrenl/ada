import java.util.*;
    /**
     * agostounoDOS
     */
public class agostounoDOS {
        private static Scanner teclado;

        public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int cantidadHoras;
        int precioTotal;
        int tarifa1 = 5;
        int tarifa2 = 4;
        int tarifa3 = 3;
        int tarifa4 = 2;

        System.out.println("Ingrese la cantidad de horas consumidas");
        cantidadHoras = teclado.nextInt();

        if (cantidadHoras <= 2) {
            precioTotal = cantidadHoras * tarifa1;
        } else {
            if (cantidadHoras > 2 && cantidadHoras <= 5) {
                cantidadHoras = cantidadHoras - 2;
                precioTotal = (2 * tarifa1) + (cantidadHoras * tarifa2);
            } else {
                if (cantidadHoras > 5 && cantidadHoras <= 10) {
                    cantidadHoras = cantidadHoras - 5;
                    precioTotal = (2 * tarifa1) + (3 * tarifa2) + (cantidadHoras * tarifa3);
                } else {
                    cantidadHoras= cantidadHoras - 10;
                    precioTotal = (2 * tarifa1) + (3 * tarifa2) + (5 * tarifa3) + (cantidadHoras * tarifa4);
                }
            }
        }
        System.out.println("El precio total a pagar es " + precioTotal);
    }

    
}