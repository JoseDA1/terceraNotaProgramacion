import java.util.HashMap;
public class Palindromo {
     public static boolean counter(int number){
        // pasa el numero a una cadena de texto
        String numberString = Integer.toString(number);
        //inicializa Hashmap con clave de caracteres y valor numerico
        HashMap<Character, Integer> counter = new HashMap<>();
        // convierte la cadena de texto en array de chars para que se pueda recorrer
        for( char digit : numberString.toCharArray()){
            // guarda en el Hash; compara con digit, si la clave no está aun devuelve 0, y despues se suma 1, cuando ya hay un valor, devuelve ese valor más 1
            counter.put(digit, counter.getOrDefault(digit, 0) + 1);
                    //   Clave  :  Valor
        }
        int numberOfAppearances = 0;
        for (int count : counter.values()) {
            if(count % 2 != 0){
                numberOfAppearances++;
            }
        }
        // si numberOfAppearances <= 1 devuelve true, si no, false
        return numberOfAppearances <= 1;
     }
    public static void main(String[] args) {
        System.out.println(counter(5));
        System.out.println(counter(2121));
        System.out.println(counter(1331));
        System.out.println(counter(3357665));
        System.out.println(counter(1294));
    }
}
