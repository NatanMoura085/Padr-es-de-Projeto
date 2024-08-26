package singleton.app;

import singleton.conexao.Conexao;
import singleton.conexao.ConexaoPOOL;

public class Client {
    public static void doQuery(){
        ConexaoPOOL conexaoPOOL = ConexaoPOOL.getInstanceConexaoPOOL();
        ConexaoPOOL conexaoPOOL2 = ConexaoPOOL.getInstanceConexaoPOOL();
        Conexao  conexao = conexaoPOOL.getConexao();
        Conexao  conexao2 = conexaoPOOL2.getConexao();
        conexao.query("SELECT A#1");
        conexao2.query("SELECT A#2");
        int POOLSIZE = ConexaoPOOL.POOL_SIZE;

        System.out.println(conexaoPOOL);
        System.out.print(conexaoPOOL2);
    }

    public static void main(String[] args) {

        doQuery();

    }
}
