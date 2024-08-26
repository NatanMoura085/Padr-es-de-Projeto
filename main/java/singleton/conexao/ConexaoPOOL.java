package singleton.conexao;

import java.util.ArrayList;
import java.util.List;

public class ConexaoPOOL {
    public final static int POOL_SIZE = 2;
    private final static ConexaoPOOL instanceConexaoPOOL = new ConexaoPOOL();
    List<Conexao> conexaoList;

    private ConexaoPOOL() {
        conexaoList = new ArrayList<Conexao>();
        for (int i = 0; i < POOL_SIZE; i++) {
            if (conexaoList != null) {
                conexaoList.add(new Conexao());
            }

        }

    }

    public static ConexaoPOOL getInstanceConexaoPOOL() {
        return instanceConexaoPOOL;
    }

    public Conexao getConexao() {
        Conexao avaible = null;

        for (Conexao conexao : conexaoList) {
            if (!conexao.getinUse()) {
                avaible = conexao;
            }
        }

        if (avaible == null) {
            System.out.print("AS CONEXAO ESTA NULLO");
        }
        return avaible;
    }

}
