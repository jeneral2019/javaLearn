package base.file;


import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {
    }

    @Test
    public void readFile01(){
        String filePath = "/Users/yuxiangfeng/Downloads/hello.txt";
        int readData = 0;
        byte[] buf = new byte[8];
        int readLen = 0;
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
//            while ((readData = fileInputStream.read()) != -1) {
//                System.out.print((char)readData);
//            }
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0,readLen));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            }catch(IOException e) {
                e.printStackTrace();
            }

        }
    }
}
