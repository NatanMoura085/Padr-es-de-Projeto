package abstratcFactory.methodsAbstractFactory;

import abstratcFactory.model.certificate.Certificate;
import abstratcFactory.model.packing.Pack;

public interface CountryRulesFactory {
    Certificate getCertificate();
    Pack getPacking();
}
