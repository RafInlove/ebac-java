package test;
import org.junit.Test;

import main.src.Pessoa;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;


public class MainTest {

    @Test
    public void testOnlyWomenInFemaleList() {
        List<Pessoa> feminino = new ArrayList<>();
        String[] nomesFemininos = {"Ana", "Maria", "Carla", "Luiza", "Beatriz"};

        for (String nome : nomesFemininos) {
            feminino.add(new Pessoa(nome, "F"));
        }

        // Verifica se todas as pessoas na lista 'feminino' têm o gênero "F"
        for (Pessoa pessoa : feminino) {
            assertTrue("A lista contém uma pessoa que não é do gênero feminino", "F".equals(pessoa.getGenero()));
        }
    }
}
