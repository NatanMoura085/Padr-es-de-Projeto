package FactoryMethod.modelIPhone;

public class IPhoneXS extends IPhone{
    @Override
    public void getHardwares() {
        System.out.print("montando iphone mais caro de todos");
    }

    @Override
    public void assembler() {
        super.assembler();
    }
}
