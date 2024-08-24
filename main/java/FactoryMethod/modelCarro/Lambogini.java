package FactoryMethod.modelCarro;

public class Lambogini extends Carro{
    @Override
    public void velocidade() {
        System.out.print("1000000000000000km");
    }

    @Override
    public void motor() {
        System.out.print("v20");
    }
}
