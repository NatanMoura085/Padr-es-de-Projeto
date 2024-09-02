package Builder.BuilderProduto.model;

 abstract public class Produto {
    private String nome;
    private String codigo;
    private String dataDeEntrega;

     public Produto(String nome, String codigo, String dataDeEntrega) {
         this.nome = nome;
         this.codigo = codigo;
         this.dataDeEntrega = dataDeEntrega;
     }

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(String dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", dataDeEntrega='" + dataDeEntrega + '\'' +
                '}';
    }
}
