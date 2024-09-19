package composite_002.model;

public class UsuarioIndividual implements UsuarioComponent{
    private String nome;
    private String email;

    public UsuarioIndividual(String nome,String email){
        this.nome = nome;
        this.email = email;

    }
    @Override
    public void notificaçao(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "UsuarioIndividual{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
