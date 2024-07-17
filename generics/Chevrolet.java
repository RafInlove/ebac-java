public class Chevrolet {
    private String modelo;
    private int ano;

    public Chevrolet(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Chevrolet{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}