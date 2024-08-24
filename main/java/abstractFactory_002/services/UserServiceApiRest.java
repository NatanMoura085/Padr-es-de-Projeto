package abstractFactory_002.services;

public class UserServiceApiRest implements UserService{
    @Override
    public void save(String nome) {
        System.out.print("Esse serviço E REST");
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
