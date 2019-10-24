package View;
import javax.swing.*;
import java.awt.Graphics;
public class PainelFundo extends JPanel {
    private ImageIcon imagem;
    public PainelFundo(String localizacao){
         imagem = new ImageIcon(localizacao);
     
     
     }
     @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagem.getImage(),0,0,this.getWidth(), this.getHeight(), this);
        
    }

    public ImageIcon getImagem() {
        return imagem;
    }

    public void setImagem(ImageIcon imagem) {
        this.imagem = imagem;
    }
    
    
    
}
