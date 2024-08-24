package FactoryMethod.modelCarro;

public class Ferrari extends Carro{
    @Override
    public void velocidade() {
        System.out.print("10000km" + "\n");
    }

    @Override
    public void motor() {
        System.out.print("V9" + "\n");
    }
}
