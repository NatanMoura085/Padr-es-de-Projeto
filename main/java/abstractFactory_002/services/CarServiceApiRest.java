package abstractFactory_002.services;

public class CarServiceApiRest implements CarService {
    @Override
    public void save(String model) {
        System.out.print("Serviço Rest do carrro");
    }

    @Override
    public void update(String newModel) {
        System.out.print("update REST" + newModel);
    }
}
