package FactoryMethod.app;

import FactoryMethod.factoryCarro.CarroSimpleFactory;
import FactoryMethod.modelCarro.Carro;

public class CarroClient {
    public static void main(String[] args) {
        Carro ferrari = CarroSimpleFactory.carroFactoryByOrder("ferrari");
         System.out.print(ferrari);
    }
}
