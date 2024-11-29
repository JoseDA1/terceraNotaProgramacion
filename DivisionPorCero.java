import java.util.Scanner;
public class DivisionPorCero {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite dos numeros");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double division = a/b;
            System.out.println("La division entre "+a+" y "+b+" es "+division);
        } catch (ArithmeticException  e) {
            // TODO: handle exception
            System.out.println("Error "+e.getMessage());
        }
     
    }
}
