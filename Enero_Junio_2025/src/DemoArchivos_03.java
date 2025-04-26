import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoArchivos_03 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream("archivo3.txt");
        //byte[]msg={'h','o','l','a',' ','m','u','n','d','o'};

        String datos="Hola mundo cruel";
        byte[]info=datos.getBytes();

        fos.write(info);
        fos.close();

        FileInputStream fis =new FileInputStream("archivo3.txt");
        System.out.println(new String(fis.readAllBytes()));
        fis.close();
    }
}
