package Prototype_003.model;

public class Address implements Cloneable{

    private final String street;
    private final String numero;

    public Address(String street, String numero) {
        this.street = street;
        this.numero = numero;
    }

    public static class Builder{
        private String street;
        private String numero;

        public Builder(String street, String numero) {
            this.street = street;
            this.numero = numero;
        }


        public Builder withStreet(String street){
            this.street = street;
            return this;
        }

        public Builder withNumero(String numero){
            this.numero = numero;
            return this;

        }

        public Builder thatAllAddress(){
            return new Builder(street,numero);
        }
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
