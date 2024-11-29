
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Fizz
{
    public static void main(String[] args) {
        int multipleThree = 3;
        int multipleFive = 5;
        for(int i = 1; i<=100; i++){
            if((i%multipleThree) == 0 && (i%multipleFive) == 0){
                System.out.println("fizzbuzz");
            }else if((i%multipleThree) == 0){
                System.out.println("fizz");
            }else if((i%multipleFive) == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
