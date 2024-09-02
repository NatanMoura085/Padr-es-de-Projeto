package Builder.BuilderProduto.builder;

import Builder.BuilderProduto.model.PS4;
import Builder.BuilderProduto.model.Produto;

public class PS4Builder extends DefaultProduto {

    @Override
    public Produto getResult() {
        return new PS4(nome,codigo,dataEntrega);
    }

    @Override
    public String toString() {
        return "PS4Builder{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", dataEntrega='" + dataEntrega + '\'' +
                '}';
    }
}
