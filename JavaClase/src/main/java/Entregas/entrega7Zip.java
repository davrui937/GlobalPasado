package Entregas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class entrega7Zip {


    public static void main(String[] args) {

        descomprimir("C:\\Users\\AlumnoM\\Desktop\\prueba\\descomprime.7z", "C:\\Users\\AlumnoM\\Desktop\\prueba\\descompreso");
        comprimir("C:\\Users\\AlumnoM\\Desktop\\prueba\\carpeta\\comp", "C:\\Users\\AlumnoM\\Desktop\\prueba\\comprime");
    }


    private static boolean descomprimir(String pathArchivoComprimido, String pathDescompresion) {

        ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\7-Zip\\7z.exe", "x", pathArchivoComprimido,  "-o" +pathDescompresion);
        pb.redirectErrorStream(true);

        try {
            Process process = pb.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = r.readLine()) != null) {
                System.out.println(line);
                if (line.contains("Everything is Ok")) {
                    return true;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return false;
    }

    private static boolean comprimir(String nombreFicheroComprimido, String ficheroAComprimir) {
        ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\7-Zip\\7z.exe", "a", nombreFicheroComprimido,  " -o" +ficheroAComprimir);
        pb.redirectErrorStream(true);

        try {
            Process process = pb.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = r.readLine()) != null) {
                System.out.println(line);
                if (line.contains("Everything is Ok")) {
                    return true;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }


}
