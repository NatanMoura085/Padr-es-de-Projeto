package composite.model;

public class File implements FileSystem {
    private String nome;

    public File(String nome) {
        this.nome = nome;
    }

    @Override
    public void print(String structure) {
        System.out.println(nome + structure);
    }
}
