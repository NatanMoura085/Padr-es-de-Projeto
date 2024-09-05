package Prototype.app;

import Prototype.animate.model.Person;
import Prototype.animate.model.PersonSample;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static List<Person> frames = new ArrayList<>();

    public static void animate() throws InterruptedException {
        Thread.sleep(3000);
        for (Person frame : frames) {
            frame.draw();
            Thread.sleep(500);
        }
    }

    public static Person addRight(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.right();
        frames.add(person);
        return person;
    }


    public static Person addLeft(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.left();
        frames.add(person);
        return person;
    }

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        PersonSample personSample = new PersonSample();
        Person person = personSample.get("stickMan");
        frames.add(person);

        person = addLeft(person);
        person = addRight(person);
        person = addLeft(person);
        person = addRight(person);
        person = addLeft(person);
        person = addRight(person);
        person = addLeft(person);
        person = addRight(person);
        person = addLeft(person);
        person = addRight(person);
        person = addLeft(person);
        person = addRight(person);
        animate();

    }
}
