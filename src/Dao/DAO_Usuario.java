package Dao;

//import com.jdenner.to.Produto;
import TAD.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Classe de acesso a dados do produto
 *
 * @author Manuel
 */
public class DAO_Usuario implements IDAO<Usuario> {

    @Override
    public void inserir(Usuario usuario) throws Exception {
        Conexao c = new Conexao();
        String sql = "INSERT INTO TBPRODUTO (NOME, PRECOCOMPRA, PRECOVENDA, QUANTIDADEESTOQUE) VALUES (?, ?, ?, 0)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, usuario.getNome());
        //ps.setDouble(2, usuario.getP);
       // ps.setDouble(3, usuario.getPrecoVenda());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void alterar(Usuario usuario) throws Exception {
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
    public void excluir(Usuario usuario) throws Exception {
        Conexao c = new Conexao();
        String sql = "DELETE FROM TBPRODUTO WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
       // ps.setInt(1, produto.getCodigo());
        ps.execute();
        c.confirmar();
    }

    @Override
    public ArrayList<Usuario> listarTodos() throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM TBPRODUTO ORDER BY NOME";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaProdutos = new ArrayList();
        while (rs.next()) {
            Usuario usuario = new Usuario();
        //    produto.setCodigo(rs.getInt("CODIGO"));
         //   produto.setNome(rs.getString("NOME"));
         //   produto.setPrecoCompra(rs.getDouble("PRECOCOMPRA"));
         //   produto.setPrecoVenda(rs.getDouble("PRECOVENDA"));
         //   produto.setQuantidade(rs.getInt("QUANTIDADEESTOQUE"));
          listaProdutos.add(usuario);
        }

        return listaProdutos;
    }

    
    public Usuario buscar(String bi) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM `usuario` WHERE `BI`=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, bi);
        ResultSet rs = ps.executeQuery();
        Usuario user = new Usuario();
        
        if (rs.next()) {
            user.setBi(rs.getString("BI"));
            user.setNome(rs.getString("nome"));
            user.setApelido(rs.getString("Apelido"));
            user.setCelular(rs.getInt("celular"));
            user.setBairro(rs.getString("bairro"));
        }

        return user;
    }
    @Override
    public Usuario recuperar(int x){
        return null;
    }
    
}
