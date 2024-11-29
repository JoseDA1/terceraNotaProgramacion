
class Person{
    String firstName;
    String lastName;
    String country;
    String continent;
    int age;
    String language;

    public Person(String firstName, String lastName, String country, String continent, int age, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.continent = continent;
        this.age = age;
        this.language = language;
    }
}
public class Countinents {
    public static boolean meetup(Person[] person){
        boolean africa = false, americas = false, asia = false, europe = false, oceania = false;
        for (Person persons : person) {
            switch (persons.continent) {
                case "Africa":
                    africa = true;
                    break;
                case "Americas":
                    americas = true;
                    break;
                case "Asia":
                    asia = true;
                    break;
                case "Europe":
                    europe = true;
                    break;
                case "Oceania":
                    oceania = true;
                    break;
            }
        }
        if(africa && americas && asia && europe && oceania){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Person[] person = new Person[5];
       person[0] = new Person(
        "Fatima", 
        "A.", 
        "Algeria", 
        "Africa", 
        25, 
        "JavaScript"
        ); 
        person[1] = new Person( 
        "Agustín",
        "M.",
        "Chile",
        "Americas",
        37,
        "C"
        ); 
        person[2] = new Person( 
        "Jing",
        "X.",
        "China",
        "Asia",
        39,
        "Ruby"
        ); 
        person[3] = new Person( 
        "Laia",
        "P.",
        "Andorra",
        "Europe",
        55,
        "Ruby"
        ); 
        person[4] = new Person( 
        "Oliver",
        "Q.",
        "Australia",
        "Oceania",
        65,
        "PHP"
        ); 
        boolean validate = meetup(person);
        System.out.println(validate);
    }
}
