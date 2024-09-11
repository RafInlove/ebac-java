package com.example.produto;

import com.example.produto.Produto;
import com.example.produto.ProdutoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    void testSalvarEListarProduto() {
        Produto produto = new Produto("Produto Teste", 100.0, 10);
        produtoRepository.save(produto);

        List<Produto> produtos = produtoRepository.findAll();
        assertEquals(1, produtos.size());
        assertEquals("Produto Teste", produtos.get(0).getNome());
    }

    @Test
    void testBuscarProdutoPorId() {
        Produto produto = new Produto("Produto Teste", 100.0, 10);
        produtoRepository.save(produto);

        Produto produtoEncontrado = produtoRepository.findById(produto.getId()).orElse(null);
        assertNotNull(produtoEncontrado);
        assertEquals("Produto Teste", produtoEncontrado.getNome());
    }

    @Test
    void testDeletarProduto() {
        Produto produto = new Produto("Produto Teste", 100.0, 10);
        produtoRepository.save(produto);

        produtoRepository.deleteById(produto.getId());
        assertFalse(produtoRepository.findById(produto.getId()).isPresent());
    }
}
