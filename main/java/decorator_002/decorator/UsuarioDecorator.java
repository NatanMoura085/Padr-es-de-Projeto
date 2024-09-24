package decorator_002.decorator;

import decorator_002.model.Usuario;

public abstract class UsuarioDecorator{
    protected Usuario usuario;

    public UsuarioDecorator(Usuario usuario) {
        this.usuario = usuario;
    }
}
