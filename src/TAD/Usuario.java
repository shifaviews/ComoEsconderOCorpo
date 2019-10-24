package TAD;
import java.io.*;

public class Usuario implements Serializable  {
    
    private String bi, nome, apelido,rua,bairro,nomeUsuario,email, dadosUser, dadosConta;
    private int celular, quarteirao,nrConta,senha;
    private Usuario user;
    private String txtUsuario;
    public Usuario(){
        
    }
    public void concatenar() {
         dadosUser = "\n--------------------[DADOS DO USUARIO]------------------------------\nBI: "+bi+"\nNome: "+nome+" "+apelido+"\nENDERECO\nQuarteirao: "+quarteirao+"\nRua: "+rua+"\nBairro: "+bairro+"\n";
         dadosConta = "\n--------------------[DADOS DA CONTA]------------------------------\nNome do Usuario: "+nomeUsuario+"\nEmail: "+email+"\nNumero de celular: "+celular+"\nNumero da conta: "+nrConta+"\n";
       
    }

    public String getBi() { return bi; }
    public String getNome() {return nome; }
    public String getApelido() {return apelido; }
    public String getBairro() {return bairro; }
    public String getRua() { return rua; }
    public int getQuarteirao() {return quarteirao; }
    public String getNomeUsuario() { return nomeUsuario; }
    public String getEmail() {return email; }
    public int getCelular() { return celular; }
    public int getNrConta() { return nrConta; } 
    public int getSenha() {return senha; }
    public String getDadosUser() {return dadosUser;}
    public String getDadosConta() {return dadosConta;}
    public Usuario getUser() {return user; }
    public String getTxtUsuario() {return txtUsuario;}

    public void setBi(String bi) {
        this.bi = bi;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDadosUser(String dadosUser) {
        this.dadosUser = dadosUser;
    }

    public void setDadosConta(String dadosConta) {
        this.dadosConta = dadosConta;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setQuarteirao(int quarteirao) {
        this.quarteirao = quarteirao;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setTxtUsuario(String txtUsuario) {
        this.txtUsuario = txtUsuario;
    }



    public String toString(){
        concatenar();
       return dadosUser+dadosConta;
   } 
  
}
