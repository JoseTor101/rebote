package inicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import nivel1.Principal;

public class Niveles extends JFrame{
    public JPanel p2 = new JPanel();

    public Niveles(){
        p2.setLayout(null); 

        setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("REBOTE");
        getContentPane().add(p2); 
        
        JLabel title = new JLabel("REBOTE INFINITO: ", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        p2.add(title);
         
        //Niveles

        JButton nivel1 = new JButton("Nivel 1");
        nivel1.setBounds(155,70,180,70);
        nivel1.setBackground(Color.decode("#dbeddc"));
        nivel1.setFont(new Font("arial", Font.BOLD, 17));
        p2.add(nivel1);

        JButton nivel2 = new JButton("Nivel 2");
        nivel2.setBounds(155,150,180,70);
        nivel2.setBackground(Color.decode("#dbeddc"));
        nivel2.setFont(new Font("arial", Font.BOLD, 17));
        p2.add(nivel2);

        JButton nivel3 = new JButton("Nivel 3");
        nivel3.setBounds(155,230,180,70);
        nivel3.setBackground(Color.decode("#dbeddc"));
        nivel3.setFont(new Font("arial", Font.BOLD, 17));
        p2.add(nivel3);

        ActionListener level1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                dispose();
                nivel1.Principal p1 = new nivel1.Principal();
            }
        };
        nivel1.addActionListener(level1);

        ActionListener level2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                dispose();
                nivel2.Principal p1 = new nivel2.Principal();
            }
        };
        nivel2.addActionListener(level2);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
