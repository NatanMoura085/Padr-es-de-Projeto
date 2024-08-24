package abstratcFactory.model.iphone;

import abstratcFactory.methodsAbstractFactory.CountryRulesFactory;

public class IPhone7 extends IPhone {

    public IPhone7(CountryRulesFactory rules) {
        super(rules);
    }

    @Override
    public void getHardWare() {
        System.out.print("IPHONE7 E MELHOR");
    }
}
