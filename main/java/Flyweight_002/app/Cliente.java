package Flyweight_002.app;

import Flyweight_002.flyweight.TipoDeContaFactory;
import Flyweight_002.model.TipoDeConta;
import Flyweight_002.model.Usuario;

public class Cliente {
    public static void main(String[] args) {
        TipoDeContaFactory factory = new TipoDeContaFactory();
        TipoDeConta tipoDeConta = TipoDeConta.ADMIN;

        Usuario usuario = new Usuario("Natan", "moura@gmail.com",factory.tipoDeConta("ADMIN"));

        System.out.println(usuario);
    }
}
