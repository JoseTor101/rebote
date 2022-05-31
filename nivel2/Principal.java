package nivel2;

import javax.swing.JFrame;
import java.util.logging.*;

public class Principal extends JFrame {
    public Juego game;
    private Hilo hilo;

    public Principal() {

        setTitle("Rebote infinito");
        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        game = new Juego();
        add(game);
        hilo = new Hilo(game);
        hilo.start();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
