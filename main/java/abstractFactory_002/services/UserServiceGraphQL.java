package abstractFactory_002.services;

public class UserServiceGraphQL implements UserService{
    @Override
    public void save(String nome) {
        System.out.print("o nome do suaer e" + nome);
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
