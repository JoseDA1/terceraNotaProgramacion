class ObjectData{
    String[] id;
    String[] name;
    int[] age;
    public ObjectData(String[] id, String[] name, int[] age){
        this.id=id;
        this.name = name;
        this.age = age;
    }
}
public class Transformador {
    public static void outPut(ObjectData objectData){
        for(int i = 0; i<objectData.id.length; i++){
            System.out.println("{id: " + objectData.id[i] + " Nombre: " + objectData.name[i] + " Edad: " + objectData.age[i] + " }");
        }
    }
    public static void main(String[] args) {
        String[] id = {"1", "2"};
        String[] name = {"Andres", "Lara"};
        int[] age = {18, 24};
        ObjectData objectData = new ObjectData(id, name, age);
        outPut(objectData);
    }
}