public class increase {
    public static int increase(int number){
        number = 12;
        System.out.println("Durante la Funcion");
        System.out.println(number);
        return number;
    }
    public static void main(String[] args) {
        int number = 87;
        System.out.println("Antes de la Funcion");
        System.out.println(number);
        System.out.println("_______________________");
        int number2 = increase(number);
        System.out.println("_______________________");
        System.out.println("Despues de la Funcion");
        System.out.println("number = " + number);
        System.out.println("Lo que devuelve la funcion en number2 = " + number2);
    }
}
