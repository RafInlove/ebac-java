package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public interface IContratoDao {
    void salvar();

    Contrato buscar(int id);

    void excluir(int id);

    void atualizar(Contrato contrato);
}
