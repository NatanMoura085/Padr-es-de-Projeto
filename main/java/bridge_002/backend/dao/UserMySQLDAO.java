package bridge_002.backend.dao;

import bridge_002.backend.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserMySQLDAO implements UserRepository{
    @Override
    public void save(User user) {
        System.out.println("Salvando com MySQL");
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>();
    }
}
