package br.com.rpires.dao.mocks;

import br.com.rpires.dao.IContratoDao;
import br.com.rpires.domain.Contrato;

public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {
    }

    @Override
    public Contrato buscar(int id) {
        return new Contrato(id, "Mock Contrato");
    }

    @Override
    public void excluir(int id) {
    }

    @Override
    public void atualizar(Contrato contrato) {
    }
}
