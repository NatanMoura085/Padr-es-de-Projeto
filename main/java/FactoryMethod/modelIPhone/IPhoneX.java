package FactoryMethod.modelIPhone;

public class IPhoneX extends IPhone{
    @Override
    public void getHardwares() {
        System.out.print("Processador potente" + "14,00,000");
    }
}
