public class Honda {
    private String modelo;
    private int ano;

    public Honda(String modelo, int ano) {
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
        return "Honda{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}