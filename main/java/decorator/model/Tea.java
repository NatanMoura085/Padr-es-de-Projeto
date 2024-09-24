package decorator.model;

public class Tea implements Drink{
    @Override
    public void server() {
        System.out.println(" add tea 100ml");
    }

    @Override
    public Double getPrice() {
        return 10.5;
    }
}
