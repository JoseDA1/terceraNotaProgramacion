import java.util.Scanner;

public class Determinar_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer: ");
        int number1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int number2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("El numero mayor es: " + number1);
        } else if (number2 > number3) {
            System.out.println("El numero mayor es: " + number2);
        } else {
            System.out.println("El numero mayor es: " + number3);
        }  
        scanner.close();
    }
}


