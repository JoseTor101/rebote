
package niveles;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Arrays;


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
        Ellipse2D circulo=new Ellipse2D.Float(100, 100, 50, 50 );
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

            int[] col1 = p1.posicion();
            int[] col2 = p2.posicion();

            if (Principal.nivel == 3 && (col1[0] == col2[0])) {
                
               // System.out.println("1. "+col1[0] + "2. "+col2[0]);
                System.out.println("1. "+col1[1] + "2. "+col2[1]);
                //p1.invertir();
                // p2.invertir();
            }
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
