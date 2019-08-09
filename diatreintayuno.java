import java.util.*;
    /**
     * diatreintayuno
     */
    public class diatreintayuno {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int sueldo;
        System.out.println("Ingrese el sueldo");
        sueldo = Teclado.nextInt();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        while (sueldo > 0) {
            if (sueldo < 500) {
                c1++;
            } else {
                if (sueldo > 520 && sueldo < 780) {
                    c2++;
                } else {
                    if (sueldo > 780 && sueldo < 999) {
                        c3++;
                    } else {
                        c4++;
                    }
                    
                }
            }     
        System.out.println("Ingrese el sueldo");
        sueldo = Teclado.nextInt();
        }
        System.out.println("La cantidad de empleados ganando menos de 500 es " + c1);
        System.out.println("La cantidad de empleados ganando entre 520 y 780 es " + c2);
        System.out.println("La cantidad de empleados ganando entre 780 y 999 es " + c3);
        System.out.println("La cantidad de empleados ganando más de 999 es " + c4);
    }
    }