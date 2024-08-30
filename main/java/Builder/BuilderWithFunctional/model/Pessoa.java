package Builder.BuilderWithFunctional.model;

public class Pessoa {
    final private String nome;
    final private String sobreNome;
    final private String telefone;
    final private String cpf;

    public Pessoa(String nome, String sobreNome, String telefone, String cpf) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }


    public static class Builder {
        private String nome;
        private String sobreNome;
        private String telefone;
        private String cpf;


        public Builder andNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder andSobreNome(String sobreNome) {
            this.sobreNome = sobreNome;
            return this;
        }

        public Builder andTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder andCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }


        public Pessoa thatAlls() {
            return new Pessoa(nome, sobreNome,telefone,cpf);
        }

    }
}
