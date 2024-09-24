package decorator_002.app;

import decorator_002.decorator.RoleUser;
import decorator_002.decorator.UsuarioDecorator;
import decorator_002.model.Usuario;

public class Cliente {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Natan Moura","email@gmail.com");
        UsuarioDecorator roleUser = new RoleUser(usuario,"ADMIN");

        System.out.println(roleUser);
    }
}
