import java.text.Normalizer;
public class Isograma {
    public static boolean compareIsogram(String text){
        String lowercaseText = text.toLowerCase();
        String unaccentedText = Normalizer.normalize(lowercaseText, Normalizer.Form.NFD);
        unaccentedText = unaccentedText.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        char[] word = unaccentedText.toCharArray();

        int length = word.length;
        for(int i = 0; i<length; i++){
            if(word[i] == ' '){
                return false;
            }

            for(int a = 0; a<length; a++){
                if(word[i] == word[a]){
                    if(a!=i){
                        return false;
                    }
                }
            }
        }
        return true;
    }   
    public static void main(String[] args) throws Exception {
        String text = "Pelos";
        String isograma = compareIsogram(text) ? "true" : "false" ;
        System.out.println(isograma);
    }
}
