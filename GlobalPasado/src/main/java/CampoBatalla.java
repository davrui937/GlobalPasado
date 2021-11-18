import java.util.Random;
import java.util.concurrent.Semaphore;

public class CampoBatalla  {
    public static int num_desp=0;
    static Integer jugadoresEnCola = 0;
    static Jugadores ganador;

    private static final int NUM_ACCESO_SIMULTANEOS = 10;
    static Semaphore semaphore= new Semaphore(NUM_ACCESO_SIMULTANEOS,true);
    static Semaphore semaphoreFinal= new Semaphore(0,true);


    static void entrarPartida(Jugadores jugador){
        System.out.println("El jugador "+jugador.getName()+" quiere entra a la partida");

        try {
            semaphore.acquire();
            incioPartida(jugador);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    static synchronized void saberBonus(Jugadores jugador) {
        if (num_desp == 0) {
            jugador.bonus=true;
            System.out.println("Soy el jugador " + jugador.getName() + " y he ganado el bonus");
        }

        if (num_desp >= 10) {

             }else if (num_desp>=5){
            semaphore.release();
            System.out.println("Soy el jugador "+jugador.getName()+" y me salgo de la partida");
        }
        num_desp++;
    }
    static void incioPartida(Jugadores jugador){
        System.out.println("El jugador "+jugador.getName()+" entra a la partida");
        try {
            Thread.sleep((new Random().nextInt(5)+1)*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Soy el jugador "+jugador.getName()+" y me acabo de despertar");

        saberBonus(jugador);


        CampoBatalla.jugadoresEnCola++;
        try {
            if (CampoBatalla.jugadoresEnCola == NUM_ACCESO_SIMULTANEOS) {
                semaphoreFinal.release(NUM_ACCESO_SIMULTANEOS);
            }
            semaphoreFinal.acquire();
            int puntos = (new Random().nextInt(500));
            new CalcGanador(jugador, puntos);
            ganador = CalcGanador.saberGanador();
            semaphoreFinal.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El ganador es "+CampoBatalla.ganador.getName()+ " con un total de "+CalcGanador.puntos_ganador+ " puntos");

    }

}

