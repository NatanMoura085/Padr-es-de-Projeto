package Builder.director;

import Builder.builder.FastFoodMealBuilder;
import Builder.model.FastFoodMeal;

public class MealDirector {
    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder){
        this.builder = builder;
    }


    public void constructorCombo(){
        builder.builderSide();
        builder.builderSalad();
        builder.builderMain();
        builder.builderHambuguer();
        builder.builderDessert();
    }

    public FastFoodMeal getCombo(){
        return builder.getMeal();
    }
}
