package composite_002.app;

import composite_002.model.UsuarioComponent;
import composite_002.model.UsuarioGrupo;
import composite_002.model.UsuarioIndividual;

public class Cliente {
    public static void main(String[] args) {
        UsuarioComponent usuario1 = new UsuarioIndividual("Natan", "email@gmail.com");
        UsuarioComponent usuario2 = new UsuarioIndividual("ronaldo", "email@gmail.com");
        UsuarioGrupo grupo1 = new UsuarioGrupo("grupo da TI");
        grupo1.adicionarMembroNoGrupo(usuario1);
        grupo1.adicionarMembroNoGrupo(usuario2);
        System.out.println(grupo1.getList());

        grupo1.notificaçao("horario da reuniao 14:00");


    }
}
