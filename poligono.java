
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Poligono
{
    public static void main(String[] args) {
        double numberOne = 0;
        double numberTwo = 0;
        int numberThree = 1;
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero del poligono que quiera calcular");
        System.out.println("1 -> Cuadrado");
        System.out.println("2 -> Rectangulo");
        System.out.println("3 -> Triangulo");
        int typePolygon = scanner.nextInt();
        System.out.println("Digite la altura y la base del poligono");
        numberOne = scanner.nextDouble();
        numberTwo = scanner.nextDouble();
        if(typePolygon == 1){
            result = polygon(numberOne, numberTwo, numberThree);
            System.out.println("El área del Cuadrado es " + result);
        }else if(typePolygon == 2){
            result = polygon(numberOne, numberTwo, numberThree);
            System.out.println("El área del Rectangulo es "+  result);
        }else if(typePolygon == 3){
            numberThree = 2;
            result = polygon(numberOne, numberTwo, numberThree);
            System.out.println("El área del Triangulo es " + result);
        }else{
            System.out.println("Digite uno de los numeros del menu, por favor reinicie");
        }
        
    }
    public static double polygon(double numberOne, double numberTwo, int numberThree){
        double result = numberOne*numberTwo/numberThree;
        return result;
    }
}
