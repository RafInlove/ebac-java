public class Pessoa {
    private String nome;
    private String genero;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return nome + (genero != null ? " (" + genero + ")" : "");
    }
}
