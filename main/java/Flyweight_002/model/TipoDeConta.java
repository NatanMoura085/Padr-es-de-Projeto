package Flyweight_002.model;

public enum TipoDeConta {
    COMUM(1, "COMUN"), ADMIN(2, "ADMIN");
    private int numero;
    private String descriçao;

    TipoDeConta(int numero, String descriçao){
        this.numero = numero;
        this.descriçao = descriçao;
    }

}
