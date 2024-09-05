package Prototype_002.model;

public class Address implements Cloneable {
    public String street;
    public Integer numero ;




    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
