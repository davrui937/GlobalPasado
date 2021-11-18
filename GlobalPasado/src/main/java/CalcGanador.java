public class CalcGanador {
    static Jugadores jugador;
    static int puntos;
    static int puntos_ganador;
    static Jugadores ganador;

    public CalcGanador(Jugadores jugador, int puntos) {
        CalcGanador.jugador = jugador;
        CalcGanador.puntos = puntos;
    }


    public static Jugadores saberGanador(){
        if (jugador.bonus){
            puntos*=2;
        }
        if (puntos>puntos_ganador) {
            puntos_ganador=puntos;
            ganador=jugador;
        }
        return ganador;
    }

}
