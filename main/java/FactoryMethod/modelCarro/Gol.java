package FactoryMethod.modelCarro;

public class Gol extends Carro{
    @Override
    public void velocidade() {
        System.out.print("60km");
    }

    @Override
    public void motor() {
        System.out.print("V5");
    }
}
