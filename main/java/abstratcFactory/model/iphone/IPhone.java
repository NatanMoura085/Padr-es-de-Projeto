package abstratcFactory.model.iphone;

import abstratcFactory.methodsAbstractFactory.CountryRulesFactory;

abstract public class IPhone {

    CountryRulesFactory rules;

    public IPhone(CountryRulesFactory rules) {
        this.rules = rules;
    }

    public  abstract void getHardWare();


    public void certificate() {
        System.out.print(rules.getCertificate().ApllyCertificate());
    }

    public void packing() {
        System.out.print(rules.getPacking().packing());
    }


}
