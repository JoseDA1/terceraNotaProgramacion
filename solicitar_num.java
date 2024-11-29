import java.util.Scanner;

public class solicitar_num {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("inrese el primero numero");
        double number1 = scanner.nextDouble();
        System.out.println("inrese el segundo numero");
        double number2 = scanner.nextDouble();
        System.out.println("inrese el tercer numero");
        double number3 = scanner.nextDouble();

       System.out.println("a > b && a < c:" + (number1 > number2 && number1 < number3));
       scanner.close();


        

    }
}