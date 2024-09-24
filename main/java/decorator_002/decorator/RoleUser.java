package decorator_002.decorator;

import decorator_002.model.Usuario;

public class RoleUser extends UsuarioDecorator {
    private String roleUser;

    public RoleUser(Usuario usuario, String roleUser) {
        super(usuario);
        this.roleUser = roleUser;
    }


    @Override
    public String toString() {
        return "RoleUser{" +
                "roleUser='" + roleUser + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
