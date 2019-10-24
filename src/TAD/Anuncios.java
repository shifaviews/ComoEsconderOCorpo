package TAD;

import java.io.*;

public class Anuncios implements Serializable   {
  
  String bairro,rua,tipoAnuncio,tipo,area;
  private int nrCasa,nrQuartos, quarteirao; 
  private float preco;
  private int andar,id, estacionamento;
  
  public Anuncios(){
  }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getTipoAnuncio() {
        return tipoAnuncio;
    }

    public void setTipoAnuncio(String tipoAnuncio) {
        this.tipoAnuncio = tipoAnuncio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(int nrCasa) {
        this.nrCasa = nrCasa;
    }

    public int getNrQuartos() {
        return nrQuartos;
    }

    public void setNrQuartos(int nrQuartos) {
        this.nrQuartos = nrQuartos;
    }

    public int getQuarteirao() {
        return quarteirao;
    }

    public void setQuarteirao(int quarteirao) {
        this.quarteirao = quarteirao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(int estacionamento) {
        this.estacionamento = estacionamento;
    }

    @Override
    public String toString() {
        return "Anuncios{" + "bairro=" + bairro + ", rua=" + rua + ", tipoAnuncio=" + tipoAnuncio + ", tipo=" + tipo + ", area=" + area + ", nrCasa=" + nrCasa + ", nrQuartos=" + nrQuartos + ", quarteirao=" + quarteirao + ", preco=" + preco + ", andar=" + andar + ", estacionamento=" + estacionamento + '}';
    }

    public void setId(int aInt) {
        this.id= aInt;
    }
    public int getId() {
        return id;
    }
  
}  