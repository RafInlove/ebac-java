package com.mod38.demo;

import com.mod38.demo.entity.Entidade;
import com.mod38.demo.repository.EntidadeRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = EntidadeRepository.class)
public class EntidadeRepositoryTest {

    @Autowired
    private EntidadeRepository entidadeRepository;

    @Test
    public void testSaveAndFind() {
        // Cria uma nova entidade
        Entidade entidade = new Entidade();
        entidade.setNome("Teste");
        entidade.setDescricao("Descrição de teste");

        // Salva a entidade no banco
        entidadeRepository.save(entidade);

        // Verifica se a entidade foi salva
        List<Entidade> entidades = entidadeRepository.findAll();
        assertThat(entidades).hasSize(1);
        assertThat(entidades.get(0).getNome()).isEqualTo("Teste");
        assertThat(entidades.get(0).getDescricao()).isEqualTo("Descrição de teste");
    }
}
