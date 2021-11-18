package Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pruebasProcesos {
    public static void main(String[] args) {
        //empezarProcesoYEsperar();
        //empezarProcesoYDestruir();

        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\\" && dir");
        pb.redirectErrorStream(true);
        try {
            Process process = pb.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*
    public static void empezarProcesoYDestruir() {
        String path = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
        ProcessBuilder pb = new ProcessBuilder(path);
        try {
            Process process = pb.start();
            System.out.println("Comenzamos a dormir");
            Thread.sleep(3000);
            System.out.println("Querememos matar a Firefox");
            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void empezarProcesoYEsperar() {
        String path = "C:\\WINDOWS\\System32\\notepad.exe";
        ProcessBuilder pb = new ProcessBuilder(path);

        try {
            Process process = pb.start();
            int status = process.waitFor();
            System.out.println("El resultado del bloc de notas es: " + status);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }*/


}