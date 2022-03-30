package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端 sockeet = " + socket.getClass());

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
