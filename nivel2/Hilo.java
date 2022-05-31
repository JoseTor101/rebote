package nivel2;

public class Hilo extends Thread {
    Juego juego;
    public Hilo(Juego juego) {
        this.juego = juego;
    }
    @Override
    public void run(){
        while (true) {
            juego.repaint();
            try {
                Thread.sleep(15);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

}
