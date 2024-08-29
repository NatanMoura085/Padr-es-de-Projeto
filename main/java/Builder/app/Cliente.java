package Builder.app;

import Builder.builder.FastFoodMealBuilder;
import Builder.builder.Menu1Builder;
import Builder.director.MealDirector;

public class Cliente {

    public static void order(FastFoodMealBuilder builder) {
        MealDirector mealDirector = new MealDirector(builder);
        mealDirector.constructorCombo();

        System.out.print(mealDirector.getCombo());
    }

    public static void main(String[] args) {
        order(new Menu1Builder());
    }
}
