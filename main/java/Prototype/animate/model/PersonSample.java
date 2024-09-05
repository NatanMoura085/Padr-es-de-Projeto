package Prototype.animate.model;

import java.util.HashMap;
import java.util.Map;

public class PersonSample {
    private static Map<String, Person> persons;

    public PersonSample() {
        persons = new HashMap<>();
        loadSample();
    }

    public Person get(String type) {
        return persons.get(type);
    }

    public void loadSample() {
        persons.put("stickMan", new Person(
                "                   ",
                "        o          ",
                "       /|\\          ",
                "_______/_\\___________"
        ));
        persons.put("fatMan", new Person(
                "                   ",
                "       (^ ^)          ",
                "       <)  )\\         ",
                "_______/__\\___________"
        ));
    }
}



