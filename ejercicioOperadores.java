
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class ejercicioOperadores
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dos numeros");
        double firstNumber = scanner.nextDouble();
        double lastNumber = scanner.nextDouble();
        System.out.println("Suma");
        System.out.println(firstNumber + lastNumber);
        System.out.println("Resta");
        System.out.println(firstNumber - lastNumber);
        System.out.println("Multiplicación");
        System.out.println(firstNumber * lastNumber);
        System.out.println("Divición");
        if(firstNumber == 0 || lastNumber == 0){
        System.out.println("Error al dividir entre cero");    
        }else{
        System.out.println(firstNumber / lastNumber);
        }
        System.out.println("Residuo");
        if(firstNumber == 0 || lastNumber == 0){
        System.out.println("Error al dividir entre cero");    
        }else{
        System.out.println(firstNumber % lastNumber);
        }
    }
}
