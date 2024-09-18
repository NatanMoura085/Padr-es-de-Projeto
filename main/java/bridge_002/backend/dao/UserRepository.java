package bridge_002.backend.dao;

import bridge_002.backend.model.User;

import java.util.List;

public interface UserRepository {
    void save(User user);
    List<User> getAll();
}
