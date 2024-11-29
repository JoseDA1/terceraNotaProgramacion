
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Comparacion2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero 1");
        int a = scanner.nextInt();
        System.out.println("Numero 2");
        int b = scanner.nextInt();
        System.out.println("Numero 3");
        int c = scanner.nextInt();
        System.out.println("a > b && a < c " + (a > b && a < c));

    }
}
