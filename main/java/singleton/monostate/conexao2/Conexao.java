package singleton.monostate.conexao2;

import java.util.Objects;

public class Conexao {
    private boolean inUse;

    public Conexao() {
        this.inUse = false;
    }

    public Objects query(String sql) {
        System.out.print("essa SQL" + sql);
        return null;
    }

    boolean getInUse(){
        return inUse;
    }
     void setInUse(boolean status){
        this.inUse = status;
     }

}
