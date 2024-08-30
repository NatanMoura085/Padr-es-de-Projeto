package Builder.BuilderWithFunctional.app;

import Builder.BuilderWithFunctional.model.Pessoa;

public class Cliente {
    public static void main(String[] args) {
        Pessoa pessoa =  new Pessoa.Builder()
                .andNome("Natan")
                .andCpf("454354354")
                .thatAlls();

        System.out.println(pessoa);
    }
}
