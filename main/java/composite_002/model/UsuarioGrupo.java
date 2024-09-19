package composite_002.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioGrupo implements UsuarioComponent {
    private String nomeGrupo;

    private List<UsuarioComponent> list;

    public UsuarioGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
        list = new ArrayList<UsuarioComponent>();
    }

    public void adicionarMembroNoGrupo(UsuarioComponent usuario){
        this.list.add(usuario);
    }

    public List<UsuarioComponent> getList(){
        return list.stream().toList();
    }

    @Override
    public void notificaçao(String message) {

        for (UsuarioComponent usuario:list){
            usuario.notificaçao(message);
        }
    }

    @Override
    public String toString() {
        return "UsuarioGrupo{" +
                "nomeGrupo='" + nomeGrupo + '\'' +
                ", list=" + list +
                '}';
    }
}
