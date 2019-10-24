package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class View_Anuncio extends JFrame{
    private JButton comprar,voltar;
    private JLabel txt_Id,txt_titulo,txt_descricao,txt_bairro,txt_preco,txt_tipo,txt_,img;
    private JRadioButton rb1,rb2,rb3,rb4;
    private JLabel querytxt_Id,querytxt_titulo,querytxt_descricao,querytxt_bairro,querytxt_preco,querytxt_tipo,querytxt_;
    private JPanel jp[],jpTxt[],imagens;    
           
    public View_Anuncio(){
                setTitle("VER ANUNCIO");
                setSize(820,640);
                setLocation(250,50);
               
                PainelFundo principal =new PainelFundo("J:\\SGAVI_Versao-1\\src\\Individuals\\imagens\\LOGIN.PNG");
                principal.setLayout(null);
                imagens = new JPanel();
                imagens.setLayout(new BorderLayout());
                imagens.setBackground(Color.BLACK);
                
                ImageIcon image = new ImageIcon("C:\\Users\\Administrator\\Desktop\\download.jpg");
                img = new JLabel(image);
                img.setBounds(100,50,300,140);
                add(img);
                
                ButtonGroup g1 = new ButtonGroup();
                rb1 = new JRadioButton("img 1");
                rb2 = new JRadioButton("img 2");
                rb3 = new JRadioButton("img 3");
                rb4 = new JRadioButton("img 4");
                
                rb1.setBounds(100, 200, 65, 20);
                rb2.setBounds(180, 200, 65, 20);
                rb3.setBounds(260, 200, 65, 20);
                rb4.setBounds(340, 200, 65, 20);
                g1.add(rb1);
                g1.add(rb2);
                g1.add(rb3);
                g1.add(rb4);
                principal.add(rb1);
                principal.add(rb2);
                principal.add(rb3);
                principal.add(rb4);
                        
                
                
                
                
                
                
                
                
                txt_Id=new JLabel("Id :");
                txt_titulo=new JLabel("Titulo :");
                txt_descricao=new JLabel("Descricao :");
                txt_bairro=new JLabel("Bairro :");
                txt_preco=new JLabel("Preco :");
                txt_tipo=new JLabel("Tipo :");
                querytxt_Id=new JLabel("0000254");
                querytxt_titulo=new JLabel("[URGENTE] - Imovel Para venda.");
                querytxt_descricao=new JLabel("Casa com pequenos problema de goteiras!");
                querytxt_bairro=new JLabel("Mahotas");
                querytxt_preco=new JLabel("5.350.096 MZN");
                querytxt_tipo=new JLabel("Venda");
                
                
                imagens.setBounds(100,50,300,140);
                txt_Id.setBounds(460,50,30,40);
                txt_preco.setBounds(460,100,100,40);
                txt_tipo.setBounds(460,150,100,40);
                txt_titulo.setBounds(100,250,100,40);
                txt_bairro.setBounds(100,300,100,40);
                txt_descricao.setBounds(100,350,130,40);
                
                querytxt_Id.setBounds(500,50,100,40);
                querytxt_preco.setBounds(540,100,150,40);
                querytxt_tipo.setBounds(520,150,100,40);
                querytxt_titulo.setBounds(200,250,520,40);
                querytxt_bairro.setBounds(200,300,100,40);
                querytxt_descricao.setBounds(220,350,500,40);
                
                
                
                comprar = new JButton("Comprar");
                voltar = new JButton("voltar");
                comprar.setBackground(new Color(240, 240, 240));
                voltar.setBackground(new Color(240, 240, 240));
                comprar.setBounds(590, 560, 100, 40);
                voltar.setBounds(700, 560, 100, 40);
                
                
                
                txt_Id.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_bairro.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_descricao.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_preco.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_tipo.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_titulo.setFont(new Font("SensSrif",Font.BOLD,20));
                
                querytxt_Id.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_bairro.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_descricao.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_preco.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_tipo.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_titulo.setFont(new Font("SensSrif",Font.BOLD,20));
                
                querytxt_descricao.setText(parametrizar(querytxt_descricao.getText()));
                principal.add(imagens);
                principal.add(txt_Id);
                principal.add(txt_bairro);
                principal.add(txt_descricao);
                principal.add(txt_preco);
                principal.add(txt_tipo);
                principal.add(txt_titulo);
                
                principal.add(querytxt_Id);
                principal.add(querytxt_bairro);
                principal.add(querytxt_descricao);
                principal.add(querytxt_preco);
                principal.add(querytxt_tipo);
                principal.add(querytxt_titulo);
                
                principal.add(imagens);
                principal.add(comprar);
                principal.add(voltar);
                setBackground(Color.green);
                
                
                add(principal);
                setVisible(true);
            }
 
    private String parametrizar(String text) {
        String x="";
        for (int i = 0; i < text.length(); i++) {
            if(i%200==0){
                
            }
            
        }
        x=text;
        return x;
    }
    public static void main(String[] args) {
        View_Anuncio a = new View_Anuncio();
       
    }

   
}
