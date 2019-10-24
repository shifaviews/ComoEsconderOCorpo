package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View_CriarConta extends JFrame{
    private JButton comprar,voltar;
    private JLabel txt_System[],txt_Query[];
    private JPanel jp[],jpTxt[],principal;
    
    public View_CriarConta(){
         setTitle("JANELA");
         setSize(820,640);
         setLocation(250,50);
         principal = new JPanel();
         principal.setLayout(null);
        
         
         comprar = new JButton("Comprar");
         voltar = new JButton("voltar");
         comprar.setBackground(new Color(240, 240, 240));
         voltar.setBackground(new Color(240, 240, 240));
         comprar.setBounds(590, 560, 100, 40);
         voltar.setBounds(700, 560, 100, 40);
         principal.add(comprar);
         principal.add(voltar);
         add(principal);
         setVisible(true);
    }

    public static void main(String[] args) {
        View_CriarConta a = new View_CriarConta();
       
    }
}
