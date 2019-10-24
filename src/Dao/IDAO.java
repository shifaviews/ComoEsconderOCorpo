package Dao;

import java.util.List;

/**
 * Interface para classes de acesso a dados
 *
 * @author Manuel
 */
public interface IDAO<Tipo> {

    public void inserir(Tipo objeto) throws Exception;

    public void alterar(Tipo objeto) throws Exception;

    public void excluir(Tipo objeto) throws Exception;

    public List<Tipo> listarTodos() throws Exception;

    public Tipo recuperar(int codigo) throws Exception;
}
