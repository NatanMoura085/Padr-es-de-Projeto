package abstratcFactory.factoryMethod;

import abstratcFactory.methodsAbstractFactory.CountryRulesFactory;
import abstratcFactory.model.iphone.IPhone;
import abstratcFactory.model.iphone.IPhone7;

public class IPhone7Factory extends IPhoneFactory {

    public IPhone7Factory(CountryRulesFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIphone(String level) {
        if ("7".equals(level)) {
            return new IPhone7(rules);

        }

        return null;
    }
}
