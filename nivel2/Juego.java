
package nivel2;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Timer;
import java.util.TimerTask;


public class Juego extends JPanel {

   private Boolean b2 = false;
   Pelota p1 = new Pelota(360, 250);
   Pelota p2;
   

    public Juego(){
        nuevaPelota();
        
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
                if (b2 == true) { 
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
        Ellipse2D circulo=new Ellipse2D.Float(100, 100, 50, 50 );
        g2.setColor(Color.RED);
        dibujar(g2);
        actualizar();
        // g2.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
        //g2.fill(new Rectangle2D.Double(0,0,100,200));
    }
    public void dibujar(Graphics2D g){
        g.fill(p1.getPelota());
        if (b2 == true) {    
            g.fill(p2.getPelota());
        }
    }

    public void actualizar(){
        //Le enviamos el tamaño del panel
        p1.mover(getBounds());
        if (b2 == true) {
            p2.mover(getBounds());
        }
    }

    public void nuevaPelota(){
        Timer timer = new Timer();
            TimerTask t1 = new TimerTask() {
             public void run(){
                 p2 = new Pelota(30, 250);
                 b2 = true;
             }
            };
        timer.schedule(t1, 5000);
       }
    
}
