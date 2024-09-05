package Builder.BuilderProduto.app;

import Builder.BuilderProduto.builder.PS4Builder;

public class Cliente {
    public static void main(String[] args) {
        PS4Builder produto = new PS4Builder();
        produto.setCodigo("342432");
        produto.setNome("PS4");
        produto.setDataEntrege("343443");

        System.out.println(produto);

    }
}
