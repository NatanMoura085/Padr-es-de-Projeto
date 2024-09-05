package Prototype_003.model;

public class User implements Cloneable {

    private final String name;
    private final String age;
    private final Address address;


    public User(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Builder cloneBuilder(){
        return new Builder(name,age,address);
    }

    public static class Builder {
        private String name;
        private String age;
        private Address address;

        public Builder(String name, String age, Address address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }


        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(String age) {
            this.age = age;
            return this;
        }

        public Builder withAdress(Address address) {
            this.address = address;
            return this;
        }

        public User thatAlls(){
            return new User(name,age,address);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address1 = (Address) super.clone();
        return new User(name, age, address1);
    }
}
