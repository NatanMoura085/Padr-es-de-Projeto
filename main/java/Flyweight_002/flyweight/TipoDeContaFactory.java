package Flyweight_002.flyweight;

import Flyweight_002.model.TipoDeConta;

import java.util.HashMap;
import java.util.Map;

public class TipoDeContaFactory {
    private static TipoDeContaFactory tipoDeContaFactory = new TipoDeContaFactory();
    private Map<String, TipoDeConta> contaMap;

    public TipoDeContaFactory() {
        contaMap = new HashMap<>();
    }

    public static TipoDeContaFactory getInstance() {
        return tipoDeContaFactory;
    }

    public TipoDeConta tipoDeConta(String tipo) {
        TipoDeConta tipoDeConta = contaMap.get(tipo);
        switch (tipo) {
            case "COMUN":
                return tipoDeConta = TipoDeConta.COMUM;
            case "ADMIN":
                return tipoDeConta = TipoDeConta.ADMIN;
            case null:
                tipoDeConta = TipoDeConta.valueOf(tipo);
            default:
                tipoDeConta = TipoDeConta.COMUM;
        }
        return tipoDeConta;
    }

    @Override
    public String toString() {
        return "TipoDeContaFactory{" +
                "contaMap=" + contaMap +
                '}';
    }
}
