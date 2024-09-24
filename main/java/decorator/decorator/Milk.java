package decorator.decorator;

import decorator.model.Drink;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void server() {
        System.out.println("add milk 100ml");
    }

    @Override
    public Double getPrice() {
        return 1.7;
    }
}
