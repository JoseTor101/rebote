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
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

}
