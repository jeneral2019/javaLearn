package base.file;

import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {

    @Test
    public void writeFile(){
        String filePath = "/Users/yuxiangfeng/Downloads/c.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath,true);
//            fileOutputStream = new FileOutputStream(filePath,true);//在后面追加

//            fileOutputStream.write('a');
            String str = "hello world!\n";
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
