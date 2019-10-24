package View;
import java.awt.*;
import javax.swing.*;

public class View_PreAnuncio extends JFrame{

    private JLabel txt_Id,txt_titulo,txt_preco,txt_tipo,img;  
    private String url,id,titulo,preco,tipo;
    private PainelFundo principal;
    
public View_PreAnuncio(){
}
public void criar(){
                principal = new PainelFundo("");
                principal.setLayout(null);
                principal.setSize(530,100);

                ImageIcon image = new ImageIcon(url);
                img = new JLabel(image);
                img.setBackground(new Color(241,241,241));
                principal.add(img);
                
                txt_Id=new JLabel(id);
                txt_titulo=new JLabel(titulo);
                txt_preco=new JLabel(preco);
                txt_tipo=new JLabel(tipo);
                
                img.setBounds(20,15,200,65);
                txt_Id.setBounds(250,15,200,20);
                txt_preco.setBounds(250,40,200,20);
                txt_tipo.setBounds(250,65,200,20);
                txt_titulo.setBounds(250,15,200,20);
                
                txt_Id.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_preco.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_tipo.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_titulo.setFont(new Font("SensSrif",Font.BOLD,20));
                
               // principal.add(txt_Id);
                principal.add(txt_preco);
                principal.add(txt_tipo);
                principal.add(txt_titulo);              
}
    public PainelFundo anuncio(){
        return principal;
    }

    public void setId(String  Id) {
        this.id=Id;
    }
    public void settitulo(String titulo) {
        this.titulo="Bairro:"+titulo;
    }
    public void setpreco(String preco) {
        this.preco="Preco :"+preco + " MZN";
    }
    public void settipo(String tipo) {
        this.tipo="Imovel :"+tipo; 
    }
    public void setUrl(String url){
        this.url = url;
    }
}
