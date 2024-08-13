package br.com.rpires.dao;

import br.com.rpires.domain.Contrato;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        // Implementação real de salvar
        throw new UnsupportedOperationException("Não funciona sem banco");
    }

    @Override
    public Contrato buscar(int id) {
        // Implementação real de buscar
        return null;
    }

    @Override
    public void excluir(int id) {
        // Implementação real de excluir
    }

    @Override
    public void atualizar(Contrato contrato) {
        // Implementação real de atualizar
    }
}
