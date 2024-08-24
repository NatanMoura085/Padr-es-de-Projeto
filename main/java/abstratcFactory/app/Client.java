package abstratcFactory.app;

import abstratcFactory.factoryMethod.IPhone7Factory;
import abstratcFactory.factoryMethod.IPhoneFactory;
import abstratcFactory.methodsAbstractFactory.CountryRulesFactory;
import abstratcFactory.methodsAbstractFactory.USCountryRules;
import abstratcFactory.model.iphone.IPhone;

public class Client {
    public static void main(String[] args) {
        CountryRulesFactory rules = new USCountryRules();
        IPhoneFactory phone = new IPhone7Factory(rules);
        IPhone p = phone.IPhoneByOrder("7");


        System.out.print(p);
    }
}
