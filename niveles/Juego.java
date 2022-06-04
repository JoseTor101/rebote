
package niveles;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;


public class Juego extends JPanel {

   public boolean p2Active = false;
   Pelota p1 = new Pelota(360, 250);
   Pelota p2;
   

    public Juego(){
        if (Principal.nivel != 1) {
            nuevaPelota();
        }
        
        setBackground(Color.BLACK);
        setOpaque(true);
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
            }
            @Override
            public void keyReleased(KeyEvent e){
            }
            @Override
            public void keyPressed(KeyEvent e){
                p1.keyPressed(e);
                if (Principal.nivel != 1  && p2Active == true) { 
                    p2.keyPressed(e);
                }
            }
        });
        setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 =(Graphics2D) g;
        g2.setColor(Color.RED);
        dibujar(g2);
        actualizar();
    }
    public void dibujar(Graphics2D g){
        g.fill(p1.getPelota());
        if (Principal.nivel != 1 && p2Active == true) {    
            g.fill(p2.getPelota());
        }
    }

    public void actualizar(){
        //Le enviamos el tamaño del panel
        p1.mover(getBounds());

        if (Principal.nivel != 1 && p2Active == true) {
            p2.mover(getBounds());
        }
        
    }
    
    public void nuevaPelota(){
        Timer timer = new Timer();
            TimerTask t1 = new TimerTask() {
             public void run(){
                p2Active = true;
                p2 = new Pelota(360, 250);
             }
            };
        timer.schedule(t1, 5000);
    }

    
}
