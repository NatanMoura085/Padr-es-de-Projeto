package singleton.monostate.conexao2;

import java.util.ArrayList;
import java.util.List;

public class ConexaoPOOL {
    private static final int POOL_SIZEE = 2;
    private static final List<Conexao> conexaoList;


    static {
        conexaoList = new ArrayList<Conexao>();
        for (int i = 0; i < POOL_SIZEE; i++) {
            conexaoList.add(new Conexao());
        }
    }

    public ConexaoPOOL() {
        System.out.print("CREATE CONEXAO");
    }


    public Conexao geConexao() {
        Conexao avaible = null;
        for (Conexao conexao : conexaoList) {
            if (!conexao.getInUse()) {
                avaible = conexao;
            }
        }

        if (avaible == null) {
            throw new NullPointerException("ESSE ESTA NULO");
        }
        avaible.setInUse(true);


        return avaible;
    }

}
