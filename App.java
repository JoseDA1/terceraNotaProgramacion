import java.util.Scanner;
public class App {
    public static void toExchange(int a, int b){
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Durante la funcion");
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dos numeros");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Antes de llamar la funcion");
        System.out.println("a = " + a + " b = " + b);
        System.out.println("---------------------------------------");
        toExchange(a, b);
        System.out.println("---------------------------------------");
        System.out.println("Despues de llamar la funcion");
        System.out.println("a = " + a + " b = " + b);
        scanner.close();
    }
}
