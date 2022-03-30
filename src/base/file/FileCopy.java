package base.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        String filePath = "/Users/yuxiangfeng/Downloads";
        String srcFileName = "/a.jpg";
        String destFileName = "/b.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            fileInputStream = new FileInputStream(filePath + srcFileName);
            fileOutputStream = new FileOutputStream(filePath + destFileName);
            byte[] buf = new byte[1024];
            int readLen = 0;

            while ((readLen = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf,0,readLen);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
