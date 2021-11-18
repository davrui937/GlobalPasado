public class Jugadores extends Thread{
        boolean bonus=false;

    @Override
    public void run() {
        CampoBatalla.entrarPartida(this);
    }
}
