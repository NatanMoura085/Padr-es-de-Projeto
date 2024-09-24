package decorator.app;

import decorator.decorator.DoubleDrink;
import decorator.model.Drink;
import decorator.model.Tea;

public class Cliente {

    public static void order(String nome, Drink drink) {
        System.out.println(nome + "esse e drink");
        drink.server();

    }

    public static void main(String[] args) {
        Drink drink = new DoubleDrink(new Tea());
        drink.server();
    }
}
