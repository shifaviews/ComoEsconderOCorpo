package Dao;

import TAD.Anuncios;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Classe de acesso a dados do produto
 *
 * @author Manuel
 */
public class DAO_Anuncio implements IDAO<Anuncios> {

    @Override
    public void inserir(Anuncios anuncios) throws Exception {
        Conexao c = new Conexao();
        String sql = "INSERT INTO TBPRODUTO (NOME, PRECOCOMPRA, PRECOVENDA, QUANTIDADEESTOQUE) VALUES (?, ?, ?, 0)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
      //  ps.setString(1, usuario.getNome());
        //ps.setDouble(2, usuario.getP);
       // ps.setDouble(3, usuario.getPrecoVenda());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void alterar(Anuncios anuncios) throws Exception {
        Conexao c = new Conexao();
        String sql = "UPDATE TBPRODUTO SET NOME=?, PRECOCOMPRA=?, PRECOVENDA=? WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
       // ps.setString(1, produto.getNome());
       // ps.setDouble(2, produto.getPrecoCompra());
        //ps.setDouble(3, produto.getPrecoVenda());
        //ps.setInt(4, produto.getCodigo());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void excluir(Anuncios anuncios) throws Exception {
        Conexao c = new Conexao();
        String sql = "DELETE FROM TBPRODUTO WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
       // ps.setInt(1, produto.getCodigo());
        ps.execute();
        c.confirmar();
    }

    @Override
    public List<Anuncios> listarTodos() throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM `imovel` ORDER by `idImovel` DESC";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        List<Anuncios> lista = new ArrayList<>();
        while (rs.next()) {
           Anuncios anuncios = new Anuncios();
              anuncios.setId(rs.getInt("idImovel"));
              anuncios.setPreco(rs.getFloat("preco"));
              anuncios.setNrQuartos(rs.getInt("nrQuartos"));
              anuncios.setBairro(rs.getString("bairro"));
              anuncios.setRua(rs.getString("rua"));
              anuncios.setQuarteirao(rs.getInt("quarteirao"));
              anuncios.setTipo(rs.getString("tipoImovel"));
              anuncios.setTipoAnuncio(rs.getString("bairro"));
            lista.add(anuncios);
        }

        return lista;
    }

    @Override
    public Anuncios recuperar(int id) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM `usuario` WHERE `BI`=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Anuncios anuncios = new Anuncios();
        
        if (rs.next()) {
              anuncios.setId(rs.getInt("idImovel"));
              anuncios.setPreco(rs.getFloat("preco"));
              anuncios.setNrQuartos(rs.getInt("nrQuartos"));
              anuncios.setBairro(rs.getString("bairro"));
              anuncios.setRua(rs.getString("rua"));
              anuncios.setQuarteirao(rs.getInt("quarteirao"));
              anuncios.setTipo(rs.getString("tipoImovel"));
        }

        return anuncios;
    }
    
    
}
