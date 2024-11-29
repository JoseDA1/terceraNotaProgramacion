public class LetrasPorNumeros {
    public static String replaceWord(String text){
        char[] alphabet = new char[26];
        //Crear abecedario
        for(int i = 0; i<26; i++){

            alphabet[i] = (char) ('a' + i);
        }
        text = text.toLowerCase();
        char[] word = text.toCharArray();
        String result = "";
        int length = word.length;
        //bucle; recorre el espacio en el texto y lo compara con cada espacio del alfabeto
        for(int i = 0; i<length; i++){
            for(int a = 0; a<26; a++){
                if(alphabet[a] == word[i]){
                    result = result + " " + (a + 1);
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        String text = "A gZ  rt";
        String result = replaceWord(text);
        System.out.println(result);
    }
}
