import java.util.Scanner;

public class ControlDeCalidad {

    public static void main(String[] args) {

        final double PESO_MINIMO_IDEAL = 450.0; 
        final double PESO_MAXIMO_IDEAL = 500.0; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sistema de Control de Calidad por Peso ---");
        System.out.print("Ingrese el peso del producto a evaluar (en gramos): ");
        
        double pesoProducto = scanner.nextDouble();
        
        scanner.close();
        System.out.println("\n--- RESULTADO DE LA EVALUACIÓN ---");
        
        if (pesoProducto >= PESO_MINIMO_IDEAL && pesoProducto <= PESO_MAXIMO_IDEAL) {
            // a. Peso ideal: entre 450g y 500g
            System.out.printf("El producto pesa %.2f g. CUMPLE: Peso Ideal.%n", pesoProducto);
        } else if (pesoProducto < PESO_MINIMO_IDEAL) {
            // b. Peso bajo: menos de 450g
            System.out.printf("El producto pesa %.2f g. NO CUMPLE: Peso Bajo (menos de %.0f g).%n", pesoProducto, PESO_MINIMO_IDEAL);
        } else { // pesoProducto > PESO_MAXIMO_IDEAL
            // c. Peso alto: más de 500g
            System.out.printf("El producto pesa %.2f g. NO CUMPLE: Peso Alto (más de %.0f g).%n", pesoProducto, PESO_MAXIMO_IDEAL);
        }
        
    }
}