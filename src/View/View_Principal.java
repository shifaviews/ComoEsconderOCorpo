package View;

import Dao.DAO_Anuncio;
import TAD.Anuncios;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class View_Principal extends JFrame implements ActionListener{
    private JButton proximo,anterior;
    private JLabel preco;
    private JButton pesquisar, notificacoes, paginaInicial, publicarAnuncio, estatisticas, login, informacoes, registar;
    private PainelFundo principal; 
    private JTextField max,min;
    private JComboBox cb,cb1,cb2,cb3,cb4;
    private JSpinner scasa,squarterao;
    private String bairros [] =  {"Bairro","HULENE","LAULANE","ZIMPETO","MAHOTAS","ALBAZINE","MUSEU","BAIXA","TCHUMENE","TRINFO","MAXAQUENE"};
    private JPanel prefab;
    private JScrollPane sPane;
    private int pagina=0;
    private JButton a[];
    private JPanel aux ;
    
    public View_Principal(){
        setTitle("JANELA");
        setSize(820,640);
        setLocation(250,50);
        principal = new PainelFundo("storage\\venda-foco.png");
        principal.setLayout(null);
        
         
        pesquisar = new JButton("Pesquisar"); pesquisar.setBackground(new Color(240, 240, 240)); 
        pesquisar.setFont(new Font("SensSrif",Font.BOLD,15));
        max = new JTextField("Max"); 
        max.setFont(new Font("SensSrif",Font.BOLD,15));
        min = new JTextField("Min");
        min.setFont(new Font("SensSrif",Font.BOLD,15));
        preco = new JLabel("Preco :"); preco.setBackground(new Color(240, 240, 240));
        preco.setFont(new Font("SensSrif",Font.BOLD,15));
        notificacoes = new JButton("Notificacoes"); notificacoes.setBackground(new Color(240, 240, 240)); 
        notificacoes.setFont(new Font("SensSrif",Font.BOLD,15));
        paginaInicial = new JButton("Pagina Inicial"); paginaInicial.setBackground(new Color(240, 240, 240)); 
        paginaInicial.setFont(new Font("SensSrif",Font.BOLD,15));
        publicarAnuncio = new JButton("Publicar Anuncio"); publicarAnuncio.setBackground(new Color(240, 240, 240)); 
        publicarAnuncio.setFont(new Font("SensSrif",Font.BOLD,15));
        estatisticas = new JButton("Estatisticas"); estatisticas.setBackground(new Color(240, 240, 240)); 
        estatisticas.setFont(new Font("SensSrif",Font.BOLD,15));
        login = new JButton("Login"); login.setBackground(new Color(240, 240, 240)); 
        login.setFont(new Font("SensSrif",Font.BOLD,15));
        informacoes = new JButton("Mais Informacoes"); informacoes.setBackground(new Color(240, 240, 240));
        informacoes.setFont(new Font("SensSrif",Font.BOLD,15));
        registar = new JButton("Registar"); registar.setBackground(new Color(240, 240, 240)); 
        registar.setFont(new Font("SensSrif",Font.BOLD,15));

        preco.setBounds(20, 50, 50, 40);
        min.setBounds(75, 50, 80, 40);
        max.setBounds(170, 50, 80, 40);
        
        cb = new JComboBox();
                for (int i=0;i<bairros.length;i++){
                    cb.addItem(bairros[i]);
                }
        cb.setBounds(270,50,100,40);
        principal.add(cb);
        
        cb2 = new JComboBox();
        cb2.addItem("Venda");
        cb2.addItem("Aluguer");
        cb2.setBounds(380,50,100,40);
        principal.add(cb2);

        cb3 = new JComboBox();
        cb3.addItem("Tipo");
        cb3.addItem("Flat");
        cb3.addItem("Casa");
        cb3.setBounds(490,50,100,40);
        principal.add(cb3);
        
        pesquisar.setBounds(600, 50, 150, 40); 
        
        principal.add(preco);
        principal.add(min);
        principal.add(max);
        
        
        paginaInicial.setBounds(20, 140, 150, 40);
        publicarAnuncio.setBounds(20, 190, 150, 40);
        estatisticas.setBounds(20, 240, 150, 40); 
        login.setBounds(20, 290, 150, 40); 
        registar.setBounds(20,340, 150, 40);
        
        
         principal.add(registar);
         principal.add(pesquisar);
        
         principal.add(notificacoes);
         principal.add(paginaInicial);
         principal.add(publicarAnuncio);
         principal.add(estatisticas);
         principal.add(login);
         
         
         proximo = new JButton("<<<");
         anterior = new JButton(">>>");
         proximo.setBackground(new Color(240, 240, 240));
         anterior.setBackground(new Color(240, 240, 240));
         proximo.setBounds(500, 560, 100, 40);
         anterior.setBounds(650, 560, 100, 40);
         
         proximo.addActionListener(this);
         anterior.addActionListener(this);
         principal.add(proximo);
         principal.add(anterior);
         

     
        aux = new JPanel();
        aux.setLayout(null);
       /* try {
            mostrarPagina();
        } catch (Exception ex) {
                Logger.getLogger(View_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       /* for (int i = 0; i < a.length; i++) { 
            a[i] = new JButton("");
            a[i].setBackground(new Color(241,241,241));
            View_PreAnuncio ad = (View_PreAnuncio) v.elementAt(i);
            a[i].add(ad.anuncio());
            a[i].setBounds(0, i*100, 530, 100);
            aux.setSize(530, i*100);
            aux.add(a[i]);
        }*/
        sPane = new JScrollPane(aux);
        sPane.createVerticalScrollBar();
        sPane.setBackground(new Color(241,241,241));
        sPane.setBounds(220, 140, 530, 400);
        sPane.setWheelScrollingEnabled(true);
        
        principal.add(sPane);

        add(principal);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==proximo){
            pagina++;
            try {
                mostrarPagina();
            } catch (Exception ex) {
                Logger.getLogger(View_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource()==anterior){
            pagina++;
            try {
                mostrarPagina();
            } catch (Exception ex) {
                Logger.getLogger(View_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    private void mostrarPagina() throws Exception {
        Vector v =new Vector();
        DAO_Anuncio dauA = new DAO_Anuncio();
        java.util.List<Anuncios> lista = dauA.listarTodos();
        
        for(int i = 0; i < lista.size(); i++) {
            Anuncios anuncioTemp = lista.get(i);
            View_PreAnuncio preAd = new View_PreAnuncio();
                preAd.setId(anuncioTemp.getId()+"");
                preAd.setpreco(anuncioTemp.getPreco()+"");
                preAd.settipo(anuncioTemp.getTipo());
                preAd.settitulo(anuncioTemp.getTipoAnuncio());
                preAd.setUrl("storage\\venda-foco.png");
                preAd.criar();
            v.add(preAd);
        } 
        
        a= new JButton[v.size()];
        int j=0;
        for (int i = pagina; i < (pagina+4); i++) { 
            a[i] = new JButton("");
            a[i].setBackground(new Color(241,241,241));
            View_PreAnuncio ad = (View_PreAnuncio) v.elementAt(i);
            a[i].add(ad.anuncio());
            a[i].setBounds(0, j*100, 530, 100);
            aux.setSize(530, j*100);
            aux.add(a[i]);
            j++;
        }
    }
}
