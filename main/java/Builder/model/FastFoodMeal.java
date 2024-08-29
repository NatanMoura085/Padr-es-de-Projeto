package Builder.model;

public class FastFoodMeal {
    private String drink;
    private String salad;
    private String main;
    private String side;
    private String dessert;
    private String humbuger;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getHumbuger() {
        return humbuger;
    }

    public void setHumbuger(String humbuger) {
        this.humbuger = humbuger;
    }

    @Override
    public String toString() {
        return "FastFoodMeal{" +
                "drink='" + drink + '\'' +
                ", salad='" + salad + '\'' +
                ", main='" + main + '\'' +
                ", side='" + side + '\'' +
                ", dessert='" + dessert + '\'' +
                ", humbuger='" + humbuger + '\'' +
                '}';
    }
}
