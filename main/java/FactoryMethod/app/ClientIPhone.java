package FactoryMethod.app;


import FactoryMethod.modelIPhone.IPhone;
import FactoryMethod.factoryIPhone.IPhoneSimpleFactory;

public class ClientIPhone {

    public static void main(String[] args) {

        IPhone phoneX = IPhoneSimpleFactory.iPhoneByOrder("XS","stand");
        phoneX.getHardwares();

        System.out.print(phoneX);

    }
}