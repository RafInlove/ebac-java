package com.example.produto;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// import com.example.produto.ProdutoService;
// import com.example.produto.ProdutoRepository;
// import com.example.produto.ProdutoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

class ProdutoServiceTest {

    @Mock
    private ProdutoRepository produtoRepository;

    @InjectMocks
    private ProdutoService produtoService;

    private Produto produto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Inicializa os mocks
        produto = new Produto("Produto Teste", 100.0, 10);
    }

    @Test
    void testSalvarProduto() {
        when(produtoRepository.save(produto)).thenReturn(produto);

        Produto produtoSalvo = produtoService.salvarProduto(produto);

        assertNotNull(produtoSalvo);
        assertEquals("Produto Teste", produtoSalvo.getNome());
        verify(produtoRepository, times(1)).save(produto);
    }

    @Test
    void testBuscarProduto() {
        when(produtoRepository.findById(1L)).thenReturn(Optional.of(produto));

        Produto produtoEncontrado = produtoService.buscarProduto(1L);

        assertNotNull(produtoEncontrado);
        assertEquals("Produto Teste", produtoEncontrado.getNome());
        verify(produtoRepository, times(1)).findById(1L);
    }

    @Test
    void testDeletarProduto() {
        produtoService.deletarProduto(1L);

        verify(produtoRepository, times(1)).deleteById(1L);
    }
}
