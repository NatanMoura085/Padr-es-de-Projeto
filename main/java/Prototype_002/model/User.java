package Prototype_002.model;

public class User implements Cloneable {
    public String nome;
    public String cep;
    public Address address;

    public User() {
        address = new Address();
    }


    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", cep='" + cep + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();

        user.address = (Address) user.address.clone();

        return user;
    }
}
