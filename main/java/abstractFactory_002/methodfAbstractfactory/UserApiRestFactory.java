package abstractFactory_002.methodfAbstractfactory;

import abstractFactory_002.services.CarService;
import abstractFactory_002.services.CarServiceGraphQL;
import abstractFactory_002.services.UserService;
import abstractFactory_002.services.UserServiceGraphQL;

public class UserApiRestFactory implements ServiceAbstractFactory{
    @Override
    public UserService getUserService() {
        return  new UserServiceGraphQL();
    }

    @Override
    public CarService getCarService() {
        return new CarServiceGraphQL();
    }
}
