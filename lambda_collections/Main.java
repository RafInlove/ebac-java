import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> todos = new ArrayList<>();
        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        String[] nomesMasculinos = {"João", "Pedro", "Carlos", "Lucas", "Mateus"};
        String[] nomesFemininos = {"Ana", "Maria", "Carla", "Luiza", "Beatriz"};
    
        for (String nome : nomesMasculinos) {
            todos.add(new Pessoa(nome));
        }
        for (String nome : nomesFemininos) {
            todos.add(new Pessoa(nome));
        }


        for (String nome : nomesMasculinos) {
            masculino.add(new Pessoa(nome, "M"));
        }
        for (String nome : nomesFemininos) {
            feminino.add(new Pessoa(nome, "F"));
        }

        System.out.println("\nGrupo:");
        todos.forEach(pessoa -> System.out.println(pessoa));

        System.out.println("\nGrupo masculino:");
        masculino.forEach(pessoa -> System.out.println(pessoa));

        System.out.println("\nGrupo feminino:");
        feminino.forEach(pessoa -> System.out.println(pessoa));
    }
}