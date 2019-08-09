import java.util.*;
    /**
     * agostounoUNO
     */
    public class agostounoUNO {
    
    
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el peso ");
        double peso;
        peso = Teclado.nextInt();
        double pesoG; 
        double montoTotal;
        int destino;

        if (peso < 5) {
            pesoG = peso * 1000;
            System.out.println("Ingrese el destino ");
            destino = Teclado.nextInt();
            switch (destino) {
                case 1:
                montoTotal = pesoG / 11.00;
                System.out.println("El precio de su paquete es " + montoTotal);
                break;
                case 2: 
                montoTotal = pesoG / 10.00;
                System.out.println("El precio de su paquete es " + montoTotal);
                break;
                case 3:
                montoTotal = pesoG / 12.00;
                System.out.println("El precio de su paquete es " + montoTotal);
                break;
                case 4: 
                montoTotal = pesoG / 24.00;
                System.out.println("El precio de su paquete es " + montoTotal);
                break;
                case 5: 
                montoTotal = pesoG / 27.00;
                System.out.println("El precio de su paquete es " + montoTotal);
                break;
            } 

        } else {
            System.out.println("Lo sentimos, nuestra compañia no hace envios mayores a 5kg.");
        }
    }
}