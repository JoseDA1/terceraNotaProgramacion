
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
import java.util.Arrays;
public class Anagrama
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firtsWord;
        String secondWord;
        System.out.println("AnaGrama, digite dos palabras. El resultado se devolverá como True o False");
        firtsWord = scanner.nextLine();
        secondWord = scanner.nextLine();
        
        String trueOrFalse = anaGrama(firtsWord, secondWord) ? "True" : "False";
        System.out.println(trueOrFalse);
    }
    
    public static boolean anaGrama(String firtsWord, String secondWord){
        firtsWord = firtsWord.toLowerCase();
        secondWord = secondWord.toLowerCase();
        
        // toCharArray Convierte en una array y junto a char vuelve cada letra en un elemento de esta
        char[] arrayOne = firtsWord.toCharArray();
        char[] arraySecond = secondWord.toCharArray();
        // Arrays.sort ordena la array
        Arrays.sort(arrayOne);
        Arrays.sort(arraySecond);
        
        if(firtsWord.equals(secondWord)){
            return false;
        }else if(Arrays.equals(arrayOne, arraySecond)){
            // Compara tanto la longitud como los elementos de los arrays
            return true;
        }else{
            return false;
        }
        
        
    }
}
