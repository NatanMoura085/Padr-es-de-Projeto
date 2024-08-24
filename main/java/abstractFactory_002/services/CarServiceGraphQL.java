package abstractFactory_002.services;

public class CarServiceGraphQL implements CarService {
    @Override
    public void save(String model) {
        System.out.print("salvando o carro com GraphQL" + model + "e dono");
    }

    @Override
    public void update(String newModel) {
        System.out.print("Atualizando o model  com GraphQL para" + newModel);
    }
}
