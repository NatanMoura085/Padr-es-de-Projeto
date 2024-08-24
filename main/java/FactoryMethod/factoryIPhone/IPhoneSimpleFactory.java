package FactoryMethod.factoryIPhone;

import FactoryMethod.modelIPhone.IPhone;
import FactoryMethod.modelIPhone.IPhoneX;
import FactoryMethod.modelIPhone.IPhoneXS;
public class IPhoneSimpleFactory {

    public static IPhone iPhoneByOrder(String generation, String level) {
        IPhone device = null;
        if ("X".equals(generation)) {
            if ("stand".equals(level)) {
                device = new IPhoneX();
                device.getHardwares();

            }

        } else if ("XS".equals(generation)) {
            if ("stand".equals(level)) {
                device = new IPhoneXS();
               device.assembler();
            }

        }

        if (device != null) {
            device.getHardwares();
            device.assembler();
        }

        return device;
    }
}
