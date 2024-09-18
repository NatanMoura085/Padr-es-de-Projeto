package bridge_002.backend.app;

import bridge_002.backend.dao.UserMySQLDAO;
import bridge_002.backend.model.User;
import bridge_002.backend.services.UserREST;
import bridge_002.backend.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        List<Object> userList = new ArrayList<>();
        User user = new User("Natan","email@gmail.com","1234");
        User user1 = new User("Natan","email@gmail.com","1234");
        userList.add(userList);
        UserService userService = new UserREST(new UserMySQLDAO());
        userService.save(user);
        userService.getAll();

    }
}
