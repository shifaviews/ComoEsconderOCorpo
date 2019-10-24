package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class View_Publicar extends JFrame{
    private JButton comprar,voltar;
    private JLabel txt_Id,txt_titulo,txt_descricao,txt_bairro,txt_preco,txt_tipo,txt_,img,txt_imagens,txt_tipoImovel,txt_Rua,txt_ncasa,txt_quarteirao;
    private JRadioButton tipo1,tipo2,tipo3,tipo4;
    private JTextField querytxt_Id,querytxt_titulo,querytxt_descricao,querytxt_bairro,querytxt_preco,querytxt_tipo,querytxt_Rua;
    private JFileChooser f;
    private JButton b1,b2,b3,b4;
    private JPanel jp[],jpTxt[],imagens; 
    private JComboBox cb,cb1,cb2,cb3,cb4;
    private JSpinner scasa,squarterao;
    private String bairros [] =  {"Escolha","HULENE","LAULANE","ZIMPETO","MAHOTAS","ALBAZINE","MUSEU","BAIXA","TCHUMENE","TRINFO","MAXAQUENE"};
           
    
    
    public View_Publicar(){
                setTitle("PUBLICAR ANUNCIO");
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
               // add(img);
                
                ButtonGroup g1 = new ButtonGroup();
                ButtonGroup g2 = new ButtonGroup();
                ButtonGroup g3 = new ButtonGroup();
                b1 = new JButton("Escolher 1");
                b2 = new JButton("Escolher 2");
                b3 = new JButton("Escolher 3");
                b4 = new JButton("Escolher 4");
                tipo1 = new JRadioButton("Venda");
                tipo2 = new JRadioButton("Alugel");
                tipo3 = new JRadioButton("Flat");
                tipo4= new JRadioButton("Casa");
                b1.setBounds(100, 100, 100, 40);
                b2.setBounds(220, 100, 100, 40);
                b3.setBounds(100, 150, 100, 40);
                b4.setBounds(220, 150, 100, 40);
                b1.setBackground(new Color(240, 240, 240));
                b2.setBackground(new Color(240, 240, 240));
                b3.setBackground(new Color(240, 240, 240));
                b4.setBackground(new Color(240, 240, 240));
                g2.add(tipo1);
                g2.add(tipo2);
                g3.add(tipo3);
                g3.add(tipo4);
                g1.add(b1);
                g1.add(b2);
                g1.add(b3);
                g1.add(b4);
                principal.add(b1);
                principal.add(b2);
                principal.add(b3);
                principal.add(b4);
                principal.add(tipo1);
                principal.add(tipo2);
                principal.add(tipo3);
                principal.add(tipo4);
                
                scasa = new JSpinner(new SpinnerNumberModel(1, 1, 400, 1));
                squarterao = new JSpinner(new SpinnerNumberModel(1, 1, 400, 1));
               
                cb1 = new JComboBox();
                for (int i=0;i<bairros.length;i++){
                    cb1.addItem(bairros[i]);
                }
                cb1.setBounds(200,300,100,40);
                principal.add(cb1);
                
                txt_Rua=new JLabel("Rua :");
                txt_imagens=new JLabel("Escolher Imagens :");
                txt_Id=new JLabel("Id :");
                txt_titulo=new JLabel("Titulo :");
                txt_descricao=new JLabel("Descricao :");
                txt_bairro=new JLabel("Bairro :");
                txt_preco=new JLabel("Preco :");
                txt_tipo=new JLabel("Tipo :");
                txt_tipoImovel=new JLabel("Tipo de Imovel:");
                txt_ncasa=new JLabel("Nr. Casa:");
                txt_quarteirao=new JLabel("Nr. Quarteirao:");
                querytxt_Id=new JTextField("");
                querytxt_titulo=new JTextField("");
                querytxt_descricao=new JTextField("");
                querytxt_bairro=new JTextField("");
                querytxt_preco=new JTextField("");
                querytxt_tipo=new JTextField("");
                querytxt_Rua=new JTextField("");
                
               // imagens.setBounds(100,50,300,140);
                txt_imagens.setBounds(100, 50, 200, 40);
                txt_Id.setBounds(460,50,30,40);
                txt_preco.setBounds(460,100,100,40);
                txt_tipo.setBounds(460,150,100,40);
                txt_titulo.setBounds(100,250,100,40);
                txt_bairro.setBounds(100,300,100,40);
                txt_descricao.setBounds(100,400,130,40);
                txt_ncasa.setBounds(320,300,100,40);
                txt_quarteirao.setBounds(520,300,155,40);
                
                querytxt_Id.setBounds(500,50,100,40);
                querytxt_preco.setBounds(540,100,150,40);
                tipo1.setBounds(540,150,70,40);
                tipo2.setBounds(620,150,70,40);
                tipo3.setBounds(270,350,70,40);
                tipo4.setBounds(360,350,70,40);
                //tipo3.setBackground(new Color(0,51,255));
                //tipo4.setBackground(new Color(0,51,255));
                querytxt_titulo.setBounds(200,250,520,40);
                txt_tipoImovel.setBounds(100,350,150,40);
                querytxt_descricao.setBounds(220,400,500,40);
                
                scasa.setBounds(420,300,50,40);
                squarterao.setBounds(666,300,50,40);
                
                comprar = new JButton("Publicar");
                voltar = new JButton("voltar");
                comprar.setBackground(new Color(240, 240, 240));
                voltar.setBackground(new Color(240, 240, 240));
                comprar.setBounds(590, 560, 100, 40);
                voltar.setBounds(700, 560, 100, 40);
                
                
                txt_imagens.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_Id.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_bairro.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_descricao.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_preco.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_tipo.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_tipoImovel.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_titulo.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_ncasa.setFont(new Font("SensSrif",Font.BOLD,20));
                txt_quarteirao.setFont(new Font("SensSrif",Font.BOLD,20));
                
                querytxt_Id.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_bairro.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_descricao.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_preco.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_tipo.setFont(new Font("SensSrif",Font.BOLD,20));
                querytxt_titulo.setFont(new Font("SensSrif",Font.BOLD,20));
                
                querytxt_descricao.setText(parametrizar(querytxt_descricao.getText()));
                principal.add(imagens);
                principal.add(txt_ncasa);
                principal.add(scasa);
                principal.add(squarterao);
                principal.add(txt_quarteirao);
              //  principal.add(txt_ncasa);
                principal.add(txt_imagens);
                principal.add(txt_bairro);
                principal.add(txt_descricao);
                principal.add(txt_preco);
                principal.add(txt_tipo);
                principal.add(txt_titulo);
                
                principal.add(txt_tipoImovel);
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
        View_Publicar a = new View_Publicar();
       
    }

   
}
