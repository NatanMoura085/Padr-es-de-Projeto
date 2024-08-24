package abstratcFactory.factoryMethod;

import abstratcFactory.methodsAbstractFactory.CountryRulesFactory;
import abstratcFactory.model.iphone.IPhone;

abstract public class IPhoneFactory {
    CountryRulesFactory rules;

    public IPhoneFactory(CountryRulesFactory rules) {
        this.rules = rules;
    }

    public IPhone IPhoneByOrder(String level) {
        IPhone device = null;
        device = createIphone(level);
        device.certificate();
        device.getHardWare();
        device.packing();
        return device;
    }

    protected abstract IPhone createIphone(String level);
}
