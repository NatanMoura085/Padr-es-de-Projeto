package singleton.conexao;

public class Conexao {
    private boolean inUse;

    public Conexao() {
        this.inUse = false;
    }

    public Object query(String sql) {
        System.out.print("essa e sql" + sql);
        return null;
    }

    boolean getinUse() {
        return inUse;
    }

    void setInUse(boolean status) {
        this.inUse = status;
    }

    void levelConectao() {
        this.inUse = false;
    }

}
