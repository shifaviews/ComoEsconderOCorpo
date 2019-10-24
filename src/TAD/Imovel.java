import java.io.*;
import java.text.DecimalFormat;



public class Imovel implements Serializable{
  protected int nrQuartos,quarteirao,nrCasa;
  protected String bairro,rua, tipo;
  protected float preco;

  public Imovel(String bairro, String rua, int quarteirao, int nrCasa, int nrQuartos, float preco, String tipo) {
      
      this.bairro = bairro;
      this.rua= rua;
      this.quarteirao = quarteirao;
      this.nrCasa = nrCasa;
      this.nrQuartos = nrQuartos;
      this.preco = preco;
      this.tipo = tipo;
  }
  
  public Imovel(){
      this("","",0,0,0,0,"");
  }
  
  public void setBairro(String bairro) {this.bairro = bairro ; }
  public void setRua(String rua) {this.rua = rua; }
  public void setQuarteirao(int quarteirao) {this.quarteirao = quarteirao; }
  public void setNrCasa(int nrCasa) {this.nrCasa = nrCasa; }
  public void setNrQuartos(int nrQuartos) {this.nrQuartos = nrQuartos; }
  public void setPreco(float preco) {this.preco = preco; }
  public void setTipo (String tipo) {this.tipo = tipo; } 
  
  public String getBairro() { return bairro;}
  public String getRua() { return rua;}
  public int getQuarteirao() { return quarteirao;}
  public int getNrCasa() { return nrCasa;}
  public int getNrQuartos() { return nrQuartos;}
  public float getPreco() { return preco;}
  public String getTipo() { return tipo; }
  
  public String toString(){
     DecimalFormat df=new DecimalFormat ("###,###.00 Mt");
      return "INFORMACOES DO IMOVEL:\nBAIRRO: "+bairro+"\nRUA: "+rua+"\nQUARTEIRAO: "+quarteirao+"\nNUMERO DO IMOVEL: "+nrCasa+"\nTIPO: "+tipo+"\nPRECO: "+df.format(preco)+"";
  }
  
}


