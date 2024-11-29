
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class camisetas
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int PANT = 30;
        final int SHIRT = 25;
        double discount = 0.75;
        double discountShirt = SHIRT*discount;
        double discountPant = PANT*discount;
        double discountSecondShirt = discountShirt*0.95;
        System.out.println("Precio de la primera camisa con el descuento: " + discountShirt);
        System.out.println("Precio de la segunda camisa con el descuento: " + discountSecondShirt);
        System.out.println("Precio de el pantalon con el descuento: " + discountPant);
        
       
    }
}
