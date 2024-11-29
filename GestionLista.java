import java.util.Scanner;
public class GestionLista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] abecedario = new char[26];
        //Crear abecedario
        for(int i = 0; i<26; i++){

            abecedario[i] = (char) ('A' + i);
        }
        try {
            System.out.println("Digite el numero correspondiente al abecedario");
            int numero = scanner.nextInt();
            System.out.println(abecedario[numero-1]);
        } catch (IndexOutOfBoundsException  e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}