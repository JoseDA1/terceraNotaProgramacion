import java.util.Stack;
public class ValidarParentesis {
    public static boolean validate(String parenthesis){
        //Inicializa Stack
        Stack<Character> counter = new Stack<>();

        for( char charParenthesis : parenthesis.toCharArray() ){
            if(charParenthesis == '('){
                //Si hay un ( lo guarda
                counter.push(charParenthesis);
            }else if(charParenthesis == ')'){
                //si hay un ) valida si no se ha guardado nada antes
                if(counter.isEmpty()){
                    return false;
                }
                // elimina el ( almacenado al momento
                counter.pop();
            }
        }
        // si está vacio devuelve true;
        return counter.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(validate("(())((()())())"));
        System.out.println(validate("()))((()))"));
    }
}
