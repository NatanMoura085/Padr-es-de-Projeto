package Builder.BuilderWithFluentApi.app;

import Builder.BuilderWithFluentApi.builder.PessoaBuilder;
import Builder.BuilderWithFluentApi.model.Pessoa;

public class Cliente {
    public static void main(String[] args) {
        Pessoa pessoaBuilder = new PessoaBuilder()
                .andNome("Natan")
                .andIdade("25")
                .thatAlls();

        System.out.print(pessoaBuilder);
    }
}
