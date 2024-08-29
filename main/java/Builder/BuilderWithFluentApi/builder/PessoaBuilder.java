package Builder.BuilderWithFluentApi.builder;

import Builder.BuilderWithFluentApi.model.Pessoa;

public class PessoaBuilder {
    private String nome;
    private String sobreNome;
    private String idade;
    private String cpf;
    private String telefone;
    private String cnpj;

    public PessoaBuilder andNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder andSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        return this;
    }

    public PessoaBuilder andIdade(String idade) {
        this.idade = idade;
        return this;
    }


    public Pessoa thatAlls() {
        return new Pessoa(nome, sobreNome, idade, cpf, telefone, cnpj);
    }

    @Override
    public String toString() {
        return "PessoaBuilder{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", idade='" + idade + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
