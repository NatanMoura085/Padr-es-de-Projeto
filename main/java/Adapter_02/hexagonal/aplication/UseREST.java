package Adapter_02.hexagonal.aplication;

import Adapter_02.hexagonal.core.model.User;
import Adapter_02.hexagonal.core.ports.UserRepository;
import Adapter_02.hexagonal.core.usercases.UserService;
import Adapter_02.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

import java.util.List;
import java.util.Map;

public class UseREST {

    private UserService userService;

    public UseREST() {
        UserRepository userRepository = new UserMemoryDatabaseAdapter();
        userService = new UserService(userRepository);
    }


    public Integer post(Map<String, String> values) {
        try {
            User user = new User(values.get("nome"), values.get("email"), values.get("password"));
            userService.saveUser(user);
            return 200;

        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public List<User> getAll(){
        return userService.getAllUses();
    }


}
