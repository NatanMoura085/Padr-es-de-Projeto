package bridge_002.backend.services;

import bridge_002.backend.dao.UserRepository;
import bridge_002.backend.model.User;

import java.util.List;

public class UserSOAP extends UserService{
    public UserSOAP(UserRepository userRepository) {
        super(userRepository);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }
}
