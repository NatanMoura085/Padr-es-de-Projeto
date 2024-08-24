package abstractFactory_002.app;

import abstractFactory_002.methodfAbstractfactory.ServiceAbstractFactory;
import abstractFactory_002.methodfAbstractfactory.UserApiRestFactory;
import abstractFactory_002.methodfAbstractfactory.UserGraphQLFactory;
import abstractFactory_002.services.CarService;
import abstractFactory_002.services.UserService;

public class Cliente {
    public static void main(String[] args) {
        ServiceAbstractFactory GraphQL =  new UserGraphQLFactory();
        ServiceAbstractFactory REST = new UserApiRestFactory();

        UserService userService = GraphQL.getUserService();
        CarService carService =  GraphQL.getCarService();
        carService.save("carro do nata");

        userService.save("Natan");

        System.out.print(userService);
        System.out.print(carService);

    }
}
