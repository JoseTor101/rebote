package nivel1;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import inicio.Niveles;


public class Pelota {
    private int x;
    private int y;
    private int inicio = 0;
    private int dx = 0, dy = 0;
    private final int ANCHO = 50, ALTO = 50;

    public Pelota(int x, int y) {
        this.x = x;
        this.y = y;

        //Velocidad aletoria al inicio
        int rx = (int)(Math.random()*(3-(-3)+1)+-3);
        int ry = (int)(Math.random()*(3-(-3)+1)+-3);

        while (rx == 0 && ry == 0 ) {
            rx = (int)(Math.random()*(3-(-3)+1)+-3);
            ry = (int)(Math.random()*(3-(-3)+1)+-3);
        }
        dx = rx;
        dy = ry;
    }

    public Ellipse2D getPelota() {
        return new Ellipse2D.Float(x, y, ANCHO, ALTO);
    }

    public void mover(Rectangle limites) {
        x += dx;
        y += dy;

        if (x+ANCHO > limites.getMaxX()) {
            dx = -dx;
        }
        if (y+ALTO > limites.getMaxY()) {
            dy = -dy;
        }
        if (x < 0) {
            dx = -dx;
        }
        if (y < 0) {
            dy = -dy;
        }
    }
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_LEFT && dx > -2) { 
        dx -= 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP && dy > -2) { 
        dy -= 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && dx < 3) { 
         dx +=1;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && dy < 3 ) { 
         dy +=1;
        }
        if (e.getKeyCode() == KeyEvent.VK_P) { //Tecla P
         dx = 0;
         dy = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_R) { //Tecla R
            int random = (int) Math.floor(Math.random()*2);
            if (random == 0 ) {
                dx = 0;
            } else
                dy= 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_Q) { //Tecla Q
          System.exit(0);
       }
       } 
}
