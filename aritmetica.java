import java.util.Scanner;

public class aritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        float numero1 = scanner.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        float numero2 = scanner.nextFloat();

        float suma = numero1 + numero2;
        float resta = numero1 - numero2;
        float multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division); 
        scanner.close();
    }
}

