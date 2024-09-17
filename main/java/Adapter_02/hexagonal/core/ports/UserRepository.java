package Adapter_02.hexagonal.core.ports;

import Adapter_02.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {
    void save(User user);
    List<User> getAll();

}
