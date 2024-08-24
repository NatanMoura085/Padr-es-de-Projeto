package abstratcFactory.methodsAbstractFactory;

import abstratcFactory.model.certificate.Certificate;
import abstratcFactory.model.certificate.USCertificate;
import abstratcFactory.model.packing.Pack;
import abstratcFactory.model.packing.USPacking;

public class USCountryRules implements CountryRulesFactory{
    @Override
    public Certificate getCertificate() {
        return new USCertificate();
    }

    @Override
    public Pack getPacking() {
        return new USPacking();
    }
}
