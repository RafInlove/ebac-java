public class PJ extends Pessoa{

    public PJ(String nome, String id) {
        super(nome, id);
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public String getId() {
        return id;
    }
}

