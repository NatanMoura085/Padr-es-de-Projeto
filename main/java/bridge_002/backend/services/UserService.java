package bridge_002.backend.services;

import bridge_002.backend.dao.UserRepository;
import bridge_002.backend.model.User;

import java.util.List;

public abstract class UserService {
    protected UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public abstract  void save(User user);
    public abstract List<User> getAll();
}
