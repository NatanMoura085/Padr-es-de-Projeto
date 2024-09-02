package Builder.BuilderProduto.builder;

import Builder.BuilderProduto.model.Produto;

abstract public class DefaultProduto<P extends Produto> implements ProdutoIMP {
    protected String nome;
    protected String codigo;
    protected String dataEntrega;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    @Override
    public void setDataEntrege(String data) {
        this.dataEntrega = data;
    }

    public abstract P getResult();
}
