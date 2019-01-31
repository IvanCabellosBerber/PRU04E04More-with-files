import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PRU04E04_Ivan_Cabellos2 {

    private static InputStream dis = devolverFichero();

    public static void main(String[] args) {
        devuelveByteList();
    }

    public static InputStream devolverFichero (){
        try {
            dis = new DataInputStream(new FileInputStream("moto.png"));

            return dis;

        } catch (IOException e){
            System.err.println();
        }
        return null;
    }

    public static byte[] devuelveByteList(){

        ArrayList<Byte> bytesFichero = new ArrayList<>();


        try {
            byte byt = (byte)dis.read();
            while (byt != -1){

                bytesFichero.add(byt);
                byt = (byte)dis.read();
            }

            byte[] arrayBytes = new byte[bytesFichero.size()];

            for (int i = 0; i < arrayBytes.length; i++) {
                arrayBytes[i] = bytesFichero.get(i);
            }

            System.out.println(Arrays.toString(arrayBytes));
            return arrayBytes;

        } catch (IOException e){
            System.err.println();
        }

        return new byte[0];

    }

}
