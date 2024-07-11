public class main {
    public static void main(String[] args) {
        PF Rodrigo = new PF("Rodrigo", "085.748.771-98");
        PJ Flavia = new PJ("Padaria da Fla", "45.732.157 0001-01");

        System.out.println("temos aqui duas pessoas: \n"+"Rodrigo e Flávia");
        System.out.println("Sobre Rodrigo: ");
        Rodrigo.Identificar();
        System.out.println("Sobre Flávia: ");
        Flavia.Identificar();
    }
}