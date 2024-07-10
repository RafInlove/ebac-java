import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main (String args[]) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Pessoa> masculino = new ArrayList<>();
        ArrayList<Pessoa> feminino = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = ler.nextLine();

            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
            String sexo = ler.nextLine();

            Pessoa pessoa = new Pessoa(nome, sexo);

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(pessoa);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(pessoa);
            } else {
                System.out.println("Sexo inválido, a pessoa não será adicionada a nenhuma lista.");
            }
    }

    System.out.println("\nGrupo masculino:");
    for (Pessoa pessoa : masculino) {
        System.out.println(pessoa);
    }

    System.out.println("\nGrupo feminino:");
    for (Pessoa pessoa : feminino) {
        System.out.println(pessoa);
    }

    System.out.println("Digite os nomes separados por vírgulas:");
    String entrada = ler.nextLine();

    System.out.println("Então estes são todos os nomes: "+entrada);

    String[] nomes = entrada.split(",");

    for (int i = 0; i < nomes.length; i++) {
        nomes[i] = nomes[i].trim();
    }

    Arrays.sort(nomes);

    System.out.println("Nomes ordenados:");
    for (String nome : nomes) {
        System.out.println(nome);
    }
}
}
