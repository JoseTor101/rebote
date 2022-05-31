
package nivel1;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class Juego extends JPanel {
   // Pelota p1 = new Pelota(this);
   
   Pelota p1 = new Pelota(360, 250);

    public Juego(){
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
            }
        });
        setFocusable(true);
    }
    // void mover(){
    //     //p1.mover();
    // };

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
    }

    public void actualizar(){
        //Le enviamos el tamaño del panel
        p1.mover(getBounds());
    }
}
