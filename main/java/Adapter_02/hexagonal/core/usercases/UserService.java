package Adapter_02.hexagonal.core.usercases;

import Adapter_02.hexagonal.core.model.User;
import Adapter_02.hexagonal.core.ports.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        boolean emailUso = userRepository.getAll().stream().anyMatch(users -> users.getEmail().equalsIgnoreCase(user.getEmail()));
        if (emailUso) {
            throw new RuntimeException("email ja em uso");
        }
        userRepository.save(user);

    }

    public List<User> getAllUses(){
        return userRepository.getAll();
    }

}
