package inicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Niveles extends JFrame{
    public JPanel p2 = new JPanel();

    public Niveles(){
        p2.setLayout(null); 

        setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("REBOTE");
        ImageIcon img = new ImageIcon("img/rebote.png");
        setIconImage(img.getImage());
        getContentPane().add(p2); 
        
        JLabel title = new JLabel("REBOTE INFINITO: ", SwingConstants.CENTER);
        title.setBounds(45, 10, 400, 30);
        title.setFont(new Font("source sans pro black", Font.BOLD, 30));
        
        p2.add(title);
         
        //Niveles

        JButton nivel1 = new JButton("Nivel 1");
        nivel1.setBounds(155, 100,180,70);
        nivel1.setBackground(Color.decode("#dbeddc"));
        nivel1.setFont(new Font("source sans pro black", Font.BOLD, 17));
        nivel1.setBackground(Color.LIGHT_GRAY);
        p2.add(nivel1);

        JButton nivel2 = new JButton("Nivel 2");
        nivel2.setBounds(155,190,180,70);
        nivel2.setBackground(Color.decode("#dbeddc"));
        nivel2.setFont(new Font("source sans pro black", Font.BOLD, 17));
        nivel2.setBackground(Color.LIGHT_GRAY);
        p2.add(nivel2);

        ActionListener level1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                dispose();
                niveles.Principal p1 = new niveles.Principal();
            }
        };
        nivel1.addActionListener(level1);

        ActionListener level2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                dispose();
                niveles.Principal.nivel = 2;
                niveles.Principal p1 = new niveles.Principal();
            }
        };
        nivel2.addActionListener(level2);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
