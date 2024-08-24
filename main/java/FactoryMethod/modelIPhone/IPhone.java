package FactoryMethod.modelIPhone;

abstract public class IPhone {

    public void assembler() {
        System.out.print("Montando os devices...");

    }
    public void getHardwares(){
        System.out.print("IPhone normal");
    }

}
