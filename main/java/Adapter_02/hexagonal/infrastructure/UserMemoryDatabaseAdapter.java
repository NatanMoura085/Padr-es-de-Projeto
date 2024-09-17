package Adapter_02.hexagonal.infrastructure;

import Adapter_02.hexagonal.core.model.User;
import Adapter_02.hexagonal.core.ports.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDatabaseAdapter implements UserRepository {
    private Map<String, User> memory = new HashMap<String,User>();

    @Override
    public void save(User user) {
        memory.put(user.getEmail(),user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>(memory.values());
    }

}
