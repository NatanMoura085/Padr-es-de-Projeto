package composite.model;

import java.util.List;

public class Folder implements FileSystem {
    private String nome;
    List<FileSystem> childrens;

    public Folder(String nome, List<FileSystem> childrens) {
        this.nome = nome;
        this.childrens = childrens;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + nome);
        for (FileSystem childrens : childrens) {
            childrens.print(structure + "|");
        }
    }
}
