package Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class entregaProceso {

    public static void main(String[] args) {
        System.out.println(hacerDirDoble());

    }

    public static String hacerDirDoble() {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\\" && dir");
        pb.redirectErrorStream(true);
        String resultado = "";
        try {
            Process process = pb.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = r.readLine()) != null) {

                System.out.println(line);

                if (line.contains("<DIR>")) {
                    resultado+=hacerDirDoble2(line.substring(36));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }




    private static String hacerDirDoble2(String nombre) {
        ProcessBuilder pb2 = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\\" && dir \""+nombre+"\n");
        pb2.redirectErrorStream(true);
        String resultado = "";
        try {
            Process process = pb2.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String lina;

            while ((lina = r.readLine()) != null) {

                resultado += lina;
                resultado += "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }

}

