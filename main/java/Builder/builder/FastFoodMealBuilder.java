package Builder.builder;

import Builder.model.FastFoodMeal;

abstract public class FastFoodMealBuilder {
    protected FastFoodMeal meal;

    public FastFoodMealBuilder() {
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal() {
        return meal;
    }


    public abstract void builderDrinl();

    public abstract void builderSalad();

    public abstract void builderMain();

    public abstract void builderSide();

    public abstract void builderDessert();

    public abstract void builderHambuguer();


}
