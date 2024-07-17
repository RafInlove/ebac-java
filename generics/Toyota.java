public class Toyota {
    private String modelo;
    private int ano;

    public Toyota(String modelo, int ano) {
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
        return "Toyota{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}