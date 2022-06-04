package niveles;

public class Ejecutar extends Thread {
    Juego juego;

    public Ejecutar(Juego juego) {
        this.juego = juego;
    }
    
    @Override
    public void run(){
        while (true) {
            juego.repaint();
            try {
                Thread.sleep(15);
            } catch (Exception e) {
            }
        }
    }

}
