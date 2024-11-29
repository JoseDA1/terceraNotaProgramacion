public class CerosAlFinal{
    public static Object[] moveZeros(Object[] array){
        int length = array.length;
        Object[] list = new Object[length];//crea array vacia con el mismo numero de elementos
        int i = 0;
        for (Object items : array) {
            if(!items.equals(0)){
                list[i++] = items; // primero asigna y despues suma
            }
        }
        while(i < length){
            list[i++] = 0;
        }
        return list;
    }
    public static void main(String[] args) {
        Object[] array = {"text", false, 0, 0, 10, 0, 2, "a", 18};
        Object[] result = moveZeros(array);
        for (Object elements : result) {
            System.out.println(elements + ", ");
        }
    }
}
