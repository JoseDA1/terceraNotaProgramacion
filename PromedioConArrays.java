import java.util.Scanner;
public class PromedioConArrays
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMTURNS = 5;

        int[] num = new int[NUMTURNS];
      
        System.out.println("Digite 5 valores Enteros");

        int i;
        
        // Primer For
        for(i=0; i<num.length; i++){
            num[i] = scanner.nextInt();
        }
        int sum = 0;
        double average = num.length;

        // Segundo For
        for(i=0; i<num.length; i++){
            sum += num[i];
            
        }
        System.out.println("Suma " + sum); 
        System.out.println("Promedio " + (sum/average));

    }
}