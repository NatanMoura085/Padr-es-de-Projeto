package decorator.decorator;

import decorator.model.Drink;

public class DoubleDrink extends DrinkDecorator{
    public DoubleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void server() {
        drink.server();
        drink.server();
    }

    @Override
    public Double getPrice() {
        return 7.0;
    }
}
