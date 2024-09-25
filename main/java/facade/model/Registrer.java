package facade.model;

import java.util.Date;

public class Registrer {
    private String storeName;
    private Double valor;
    private Date data;

    public Registrer(String storeName, Double valor, Date data) {
        this.storeName = storeName;
        this.valor = valor;
        this.data = data;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Registrer{" +
                "storeName='" + storeName + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
