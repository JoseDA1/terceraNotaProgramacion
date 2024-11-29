public class Fibonacci
{
    public static void main(String[] args) {
        long firtsNumber = 0;
        long secondNumber = 1;
        long thirdNumber = 0;
        
        System.out.println("Los primeros 50 numeros de fibonacci");
        for(int i = 0; i<50; i++){
            System.out.println((i + 1) + ". " + firtsNumber + ", ");
            thirdNumber = firtsNumber;
            firtsNumber += secondNumber;
            secondNumber = thirdNumber;
        }
            
        }
    
        
}