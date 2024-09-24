package decorator.model;

public class Expresso implements Drink{
    @Override
    public void server() {
        System.out.println("add expresso 100ml");
    }

    @Override
    public Double getPrice() {
        return 2.5;
    }
}
