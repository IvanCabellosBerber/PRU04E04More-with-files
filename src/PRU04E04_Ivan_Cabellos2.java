import java.io.*;

public class PRU04E04_Ivan_Cabellos2 {

    private static InputStream dis;

    public static void main(String[] args) {

        dis = devolverFichero();
        try {
            assert dis != null;
            System.out.print((char) dis.read());

        } catch (IOException e){
            System.err.println();
        }

    }

    public static InputStream devolverFichero (){
        try {
            dis = new DataInputStream(new FileInputStream("moto-png"));

            return dis;

        } catch (IOException e){
            System.err.println();
        }
        return null;
    }

}
