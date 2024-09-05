package Prototype_002.app;

import Prototype_002.model.User;

public class Cliente {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.cep = "34324324";
        user.nome = "Natan";
        user.address.street = "3432432";
        user.address.numero = 432432;


        System.out.println(user);
        User user1 = (User) user.clone();

        user1.address.street="222222222222222";
        System.out.println(user);
        System.out.println(user1);
    }
}
