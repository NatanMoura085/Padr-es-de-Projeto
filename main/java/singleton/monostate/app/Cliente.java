package singleton.monostate.app;

import singleton.monostate.conexao2.Conexao;
import singleton.monostate.conexao2.ConexaoPOOL;

public class Cliente {
    public static void main(String[] args) {
        ConexaoPOOL conexaoPOOL = new ConexaoPOOL();
        Conexao conexao = conexaoPOOL.geConexao();

        ConexaoPOOL conexaoPOOL2 = new ConexaoPOOL();
        Conexao conexao2 = conexaoPOOL.geConexao();
        var cone1 = conexao.query("query dddd");
        var cone2 = conexao2.query("query 222");

        System.out.print(cone1  + "\n");
        System.out.print(conexaoPOOL == conexaoPOOL2);


    }
}
