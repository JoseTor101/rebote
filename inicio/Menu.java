package inicio;

import javax.swing.*;
import java.awt.Font;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;


public class Menu extends JFrame {
    public JPanel p1 = new JPanel();

    public Menu() throws InterruptedException{
        p1.setLayout(null); 

        setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("REBOTE INFINITO");
        getContentPane().add(p1); 
       
        JLabel backImg = new JLabel();
        ImageIcon imgB = new ImageIcon("./img/rebote.png");
        backImg.setBounds(140,20,200,160);
        backImg.setIcon(new ImageIcon(imgB.getImage().getScaledInstance(200, 160, Image.SCALE_SMOOTH)));
        p1.add(backImg);
        
        JLabel title = new JLabel("REBOTE INFINITO: ", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        p1.add(title);
        
        JLabel team = new JLabel("INTEGRANTES: ", SwingConstants.CENTER);
        team.setBounds(90, 200, 300, 30);
        team.setFont(new Font("arial", Font.BOLD, 20));
        p1.add(team);

        JLabel member = new JLabel("JOSÉ TORDECILLA ", SwingConstants.CENTER);
        member.setBounds(90, 270, 300, 30);
        member.setFont(new Font("arial", Font.BOLD, 20));
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
        timer.schedule(t1, 500);
    }

}
