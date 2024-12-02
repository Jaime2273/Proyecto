package figuras;
import java.util.Scanner;
public class Trapecio {

    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la primera base: ");
        double base1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud de la segunda base: ");
        double base2 = scanner.nextDouble();
        System.out.print("Ingrese la altura del trapecio: ");
        double altura = scanner.nextDouble();
        double area = ((base1 + base2) * altura) / 2;
        System.out.println("El área del trapecio es: " + area);
        scanner.close();
    }
}
