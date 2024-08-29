package Builder.builder;

public class Menu1Builder extends FastFoodMealBuilder {
    @Override
    public void builderDrinl() {
        meal.setDrink("BEBIDA QUENTE");
    }

    @Override
    public void builderSalad() {
        meal.setSalad("SALADA DE ALFACE");
    }

    @Override
    public void builderMain() {

    }

    @Override
    public void builderSide() {

    }

    @Override
    public void builderDessert() {

    }

    @Override
    public void builderHambuguer() {
        meal.setHumbuger("HAMBUGUER ");
    }
}
