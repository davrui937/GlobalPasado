public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            Jugadores t = new Jugadores();
            t.setName("Jugador " + i);
            t.start();
        }

    }

}

