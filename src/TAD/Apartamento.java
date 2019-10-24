public class Apartamento extends Flat{
    
     private int andar;
    
    public Apartamento(String bairro, String rua, int quarteirao, int nrCasa, int nrQuartos, float preco, String tipo, int estacionamento, int andar){
        super (bairro, rua,quarteirao, nrCasa, nrQuartos, preco, tipo, estacionamento);
        this.andar = andar;

    }
    public Apartamento(){
      this("","",0,0,0,0,"",0,0);
  }
      public void setAndar(int andar) {this.andar = andar; }
      public int getAndar() { return andar;}
      public String toString(){ return super.toString()+"\nANDAR Nr: "+andar;}
    
    
    
}
