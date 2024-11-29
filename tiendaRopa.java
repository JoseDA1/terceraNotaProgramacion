import java.util.Scanner;

public class tiendaRopa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos a Mattelsa");
        byte tshirt = 25;
        byte pants = 30;
        double sale15 = 0.85;
        double sale5 = 0.95;
         
        System.out.println("ingrese la cantidad de camisetas: ");
        byte numTshirt = scanner.nextByte();
        System.out.println("Ingrese la cantidad de pantalones: ");
        byte numPants = scanner.nextByte();

        double salePants = numPants * pants * sale15;
        
        double saleTshirt= 0;

        if (numTshirt >= 2) {
            double preSale = tshirt * sale15;
            double addSale = preSale * sale5;
            saleTshirt = addSale + (preSale * (numTshirt - 1));
        } else {saleTshirt = tshirt * sale15;}

        double saleTotal = saleTshirt+ salePants;
       

        System.out.println("Camiseta: $25");
        System.out.println("Pantalon $30");
        System.out.println("El total de las prendas: " + " Camisetas: " + numTshirt + " Pantalones: " + numPants + " Con el descuento es de: " + saleTotal);
        scanner.close();

       



        

    }
}
    
