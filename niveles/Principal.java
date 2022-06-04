package niveles;

import javax.swing.JFrame;
import javax.swing.*;

public class Principal extends JFrame {
    
    public static int nivel = 1;
    public Juego game;

    public Principal() {

        setTitle("Rebote infinito");
        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("img/rebote.png");
        setIconImage(img.getImage());
        
        game = new Juego();
        add(game);
        Ejecutar j1 = new Ejecutar(game);
        j1.start();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
