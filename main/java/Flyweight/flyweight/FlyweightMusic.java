package Flyweight.flyweight;

public class FlyweightMusic {

    private String nome;
    private String artist;
    private String duraTionsMusic;

    public FlyweightMusic(String nome, String artist, String duraTionsMusic) {
        this.nome = nome;
        this.artist = artist;
        this.duraTionsMusic = duraTionsMusic;

    }

    public String getNome() {
        return nome;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuraTionsMusic() {
        return duraTionsMusic;
    }

    @Override
    public String toString() {
        return "FlyweightMusic{" +
                "nome='" + nome + '\'' +
                ", artist='" + artist + '\'' +
                ", duraTionsMusic='" + duraTionsMusic + '\'' +
                '}';
    }
}
