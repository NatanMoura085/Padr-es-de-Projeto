package Prototype_003.app;

import Prototype_003.model.Address;
import Prototype_003.model.User;

public class Cliente {
    public static void main(String[] args) {
        User user = new User("Natan","25",new Address("ABC","150"));
        User user1 = user
                .cloneBuilder()
                .withName("Ronaldo")
                .withAge("24")
                .withAdress(new Address("AB","22"))
                .thatAlls();

        System.out.println(user);
        System.out.println(user1);
    }
}
