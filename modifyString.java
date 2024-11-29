public class modifyString {
    public static void modifyString(String text){
        text = "Hi and bye";
        System.out.println("Durante la funcion");
        System.out.println("text = " + text);
    }
    public static void main(String[] args) {
        String text = "Hi, How are you?";
        System.out.println("Antes de la funcion");
        System.out.println("text = " + text);
        System.out.println("________________________");
        modifyString(text);
        System.out.println("________________________");
        System.out.println("Despues la funcion");
        System.out.println("text = " + text);
    }
}
