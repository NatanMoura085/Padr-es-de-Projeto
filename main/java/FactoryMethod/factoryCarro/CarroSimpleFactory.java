package FactoryMethod.factoryCarro;

import FactoryMethod.modelCarro.Carro;
import FactoryMethod.modelCarro.Ferrari;
import FactoryMethod.modelCarro.Gol;
import FactoryMethod.modelCarro.Lambogini;

public class CarroSimpleFactory {

    public static Carro carroFactoryByOrder(String nomeCarro) {
        Carro carro = null;

        if ("ferrari".equals(nomeCarro)) {
            carro = new Ferrari();
        } else if ("Gol".equals(nomeCarro)) {
            carro = new Gol();
        } else if ("lambogini".equals(nomeCarro)) {
            carro = new Lambogini();

        }

        if (carro != null) {
            carro.motor();
            carro.velocidade();
        }

        return carro;
    }
}
