public class Pessoa {
    public String nome;
    public String id;

    public Pessoa(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void Identificar() {
        if(id.length() > 14) {
            System.out.println("Esta pessoa é jurídica");
        }
        else {
            System.out.println("Esta pessoa é física");
        }
    }
}
