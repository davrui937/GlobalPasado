package Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class entregaExamen {

    public static void main(String[] args) {

        System.out.println(getIp4());
        System.out.println(getSubred());
        System.out.println(getPuertaEnlace());
        System.out.println(hacerPing(getIp4()));
    }

    /**
     * @return Devuelve la IP del usuario. Ejemplo:
     * Direcci¢n IPv4. . . . . . . . . . . . . . : 1.1.1.1
     */
    public static String getIp4() {

        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "ipconfig");
        pb.redirectErrorStream(true);
        String resultado = "";

        try {
            Process process = pb.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = r.readLine()) != null) {


                if (line.contains("IPv4")) {
                    return line.substring(47);
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultado;
    }


    /**
     * @return Devuelve la subred del usuario. Ejemplo: 1.1.1.1
     * M scara de subred . . . . . . . . . . . . : 1.1.1.1
     */
    public static String getSubred() {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "ipconfig");
        pb.redirectErrorStream(true);

        try {
            Process process = pb.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = r.readLine()) != null) {

                if (line.contains("subred"))
                    return line.substring(47);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Error";
    }


    /**
     * @return Devuelve la subred del usuario. Ejemplo: 1.1.1.1
     * Puerta de enlace predeterminada . . . . . : 1.1.1.1
     */
    public static String getPuertaEnlace() {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "ipconfig");
        pb.redirectErrorStream(true);
        try {
            Process process = pb.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = r.readLine()) != null) {


                if (line.contains("Puerta de enlace")){
                    return line.substring(47);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Error";
    }

    /**
     * Devuelve el resultado de hacer el ping a la IP pasada por parámetro "ip"
     */
    public static String hacerPing(String ip) {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "ping " + ip);
        pb.redirectErrorStream(true);
        String resultado = "";
        try {
            Process process = pb.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = r.readLine()) != null) {

                resultado += line;
                resultado += "\n";
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return resultado;
    }
}

