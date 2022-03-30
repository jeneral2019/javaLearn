package api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 演示INetAddress 类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress localHost = InetAddress.getLocalHost();
//        System.out.println(localHost);


        System.out.println(InetAddress.getByName("www.baidu.com"));
    }
}
