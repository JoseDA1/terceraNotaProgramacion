
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Primos
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int cyclo = 100;
        boolean confirm;
        String result;
        
        System.out.println("Digite un numero positivo");
        number = scanner.nextInt();
        if(number > 0){
            confirm = primeNumber(number);
            result = confirm ? "Es Primo" : "No es Primo";
            System.out.println(result);
        }else{
            System.out.println("Numero invalido, por favor reinicie");
        }
        System.out.println("Estos son los números primos entre el 1 al 100");
        for(int i = 1; i <= cyclo; i++){
            if(primeNumber(i)){
                System.out.println(i);
            }
            
        }
        
        
    }
    public static boolean primeNumber(int number){
        for(int i = 2; i < number; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
