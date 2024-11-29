
class Rectangulo {
    double width;
    double high;
    public Rectangulo(double width, double high){
        this.width = width;
        this.high = high;
    }
}

public class Rectangle{
    public static void main(String[] args) {
        double width = 56;
        double higt = 22;
        Rectangulo rectangle = new Rectangulo(width, higt);
        System.out.println("Antes del metodo");
        System.out.println("Ancho = " + rectangle.width + " Alto = " + rectangle.high);
        System.out.println("________________________________");
        modifyRectangule(rectangle);
        System.out.println("________________________________");
        System.out.println("Despues del metodo");
        System.out.println("Ancho = " + rectangle.width + " Alto = " + rectangle.high);
    }
    public static void modifyRectangule(Rectangulo rectangle){
        rectangle.width = 92;
        rectangle.high = 47;
        System.out.println("Durante el metodo");
        System.out.println("Ancho = " + rectangle.width + " Alto = " + rectangle.high);

    }
}
