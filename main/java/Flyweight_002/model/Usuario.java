package Flyweight_002.model;

public class Usuario {
    private String nome;
    private String email;
    private TipoDeConta tipoDeConta;

    public Usuario(String nome, String email, TipoDeConta tipoDeConta){
        this.nome = nome;
        this.email =email;
        this.tipoDeConta =tipoDeConta;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", tipoDeConta=" + tipoDeConta +
                '}';
    }
}
