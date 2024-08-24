package abstractFactory_002.methodfAbstractfactory;

import abstractFactory_002.services.CarService;
import abstractFactory_002.services.UserService;

public interface ServiceAbstractFactory {
    UserService getUserService();

    CarService getCarService();
}
