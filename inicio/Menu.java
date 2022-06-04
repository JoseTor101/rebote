package inicio;

import javax.swing.*;
import java.awt.Font;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;


public class Menu extends JFrame {
    public JPanel p1 = new JPanel();

    public Menu(){
        p1.setLayout(null); 

        setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("REBOTE INFINITO");
        ImageIcon img = new ImageIcon("img/rebote.png");
        setIconImage(img.getImage());
        getContentPane().add(p1); 
       
        JLabel title = new JLabel("REBOTE INFINITO: ", SwingConstants.CENTER);
        title.setBounds(40, 10, 400, 30);
        title.setFont(new Font("source sans pro black", Font.BOLD, 35));
        p1.add(title);

        JLabel backImg = new JLabel();
        ImageIcon imgB = new ImageIcon("./img/rebote.png");
        backImg.setBounds(140,50,200,160);
        backImg.setIcon(new ImageIcon(imgB.getImage().getScaledInstance(200, 160, Image.SCALE_SMOOTH)));
        p1.add(backImg);
        
        
        JLabel team = new JLabel("INTEGRANTES: ", SwingConstants.CENTER);
        team.setBounds(90, 240, 300, 30);
        team.setFont(new Font("source sans pro black", Font.BOLD, 20));
        p1.add(team);

        JLabel member = new JLabel("JOSÉ TORDECILLA ", SwingConstants.CENTER);
        member.setBounds(90, 290, 300, 30);
        member.setFont(new Font("source sans pro black", Font.BOLD, 20));
        member.setForeground(Color.blue);
        p1.add(member);

        nivelesAbrir();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void nivelesAbrir(){
        Timer timer = new Timer();
        TimerTask t1 = new TimerTask() {
            public void run(){
               dispose();
               Niveles n1 = new Niveles();
               n1.setVisible(true);
            }
        };
        timer.schedule(t1, 10000);
    }

}
