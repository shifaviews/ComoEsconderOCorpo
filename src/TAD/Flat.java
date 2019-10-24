public class Flat extends Imovel{
    private int estacionamento;
    
    public Flat(String bairro, String rua, int quarteirao, int nrCasa, int nrQuartos, float preco, String tipo, int estacionamento){
        super (bairro, rua, quarteirao, nrCasa, nrQuartos, preco,"Apartamento");
        this.estacionamento = estacionamento;

    }
    public Flat(){
      this("","",0,0,0,0,"",0);
  }
      public void setEstacionamento(int estacionamento) {this.estacionamento = estacionamento; }
      public int getEstacionamento() { return estacionamento;}
      public String toString(){ return super.toString()+"\nESTACIONAMENTO: "+estacionamento;}
}

