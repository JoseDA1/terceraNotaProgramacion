public class modifyArray {
    public static void modifyArray(int[] array){
        for(int i = 0; i < 5; i++){
            array[i] = i*12;
        }
        System.out.println("Durante la funcion");
        System.out.print("numbers = ");
        for(int number : array){
            System.out.print(number + ", ");
        }

    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Antes de llamar la funcion");
        System.out.print("numbers = ");
        for(int number : numbers){
            System.out.print(number + ", ");
        }
        System.out.println();
        System.out.println("___________________");
        modifyArray(numbers);
        System.out.println();
        System.out.println("___________________");
        System.out.println("Despues de llamar la funcion");
        System.out.print("numbers = ");
        for(int number : numbers){
            System.out.print(number + ", ");
        }
    }
}