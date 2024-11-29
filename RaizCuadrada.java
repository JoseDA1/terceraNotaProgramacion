import java.util.Scanner;

class NumeroNegativoException extends Exception{
    public NumeroNegativoException(String mensaje){
        super(mensaje);
    }
}
public class RaizCuadrada{
    public static void validarNumero(int a) throws NumeroNegativoException{
        if(a<0){
            throw new NumeroNegativoException("Error / Numero negativo");
        }else{
            System.out.println("La raiz de " + a +" es " +Math.sqrt(a));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite un numero");
            int a = scanner.nextInt();
            validarNumero(a);
        } catch (NumeroNegativoException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());

        }
    }
}