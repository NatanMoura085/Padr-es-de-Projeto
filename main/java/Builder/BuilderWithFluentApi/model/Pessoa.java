package Builder.BuilderWithFluentApi.model;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private String idade;
    private String cpf;
    private String telefone;
    private String cnpj;

    public Pessoa(String nome, String sobreNome, String idade, String cpf, String telefone, String cnpj) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", idade='" + idade + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
