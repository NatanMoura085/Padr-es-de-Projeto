package Prototype.animate.model;

public class Person implements Cloneable{
    private String linha1;
    private String linha2;
    private String linha3;
    private String linha4;

    public Person(String linha1, String linha2, String linha3, String linha4) {
        this.linha1 = linha1;
        this.linha2 = linha2;
        this.linha3 = linha3;
        this.linha4 = linha4;
    }


    public void draw() {
        System.out.println(" ");
        System.out.println(linha1);
        System.out.println(linha2);
        System.out.println(linha3);
        System.out.println(linha4);
    }

    public void left() {
        linha1 = linha1.substring(1);
        linha2 = linha2.substring(1);
        linha3 = linha3.substring(1);
        linha4 = linha4.substring(1);
    }

    public void right() {
        linha1 = " " + linha1;
        linha2 = " " + linha2;
        linha3 = " " + linha3;
        linha4 = " " + linha4;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
