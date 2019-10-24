public class Casa extends Imovel {
    
    private String area;
    
    public Casa(String bairro, String rua, int quarteirao, int nrCasa, int nrQuartos, float preco, String area){
        super (bairro, rua, quarteirao, nrCasa, nrQuartos, preco, "Casa");
        this.area = area;

    }
     public Casa(){
      this("","",0,0,0,0,"");
  }
      public void setArea(String area) {this.area = area; }
      public String getArea() { return area;}
      public String toString(){ return super.toString()+"\nAREA/Quintal: "+area;}

}
