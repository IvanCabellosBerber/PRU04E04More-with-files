import java.io.*;
import java.util.Scanner;

public class PRU04E04_Ivan_Cabellos {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        System.out.println("Nombre del fichero");
        String nombreArchivo = sc.next();



        File archivo = new File(nombreArchivo);
        float fileLenght = archivo.length();

        System.out.println(fileLenght + " Bytes");

        System.out.println((fileLenght / 1024) + " KBytes");

        System.out.println(((fileLenght / 1024) / 1024) + " MBytes");

    }

}
