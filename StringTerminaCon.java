public class StringTerminaCon {
    public static boolean identifyString(String textOne, String textTwo){

        char[] charTextOne = textOne.toCharArray(); // hola
        char[] charTextTwo = textTwo.toCharArray(); // ola
        int lengthCharTextOne = charTextOne.length;
        int lengthCharTextTwo = charTextTwo.length;
        if(lengthCharTextTwo > lengthCharTextOne){
            return false;
        }

        // recorre segun la seguna palabra
        for (int i = 0; i < lengthCharTextTwo; i++) {
            // Compara el carácter de textOne con textTwo
            if (charTextOne[lengthCharTextOne - 1 - i] != charTextTwo[lengthCharTextTwo - 1 - i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        boolean trueOrFalse = identifyString("Abecedario", "Abecedario");
        System.out.println(trueOrFalse);
    }
}