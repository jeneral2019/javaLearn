package base.homework;

import base.maze.Run;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        login();
    }

    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        while (true){
            String name = scanner.next();
            if (name != null && name.length() <= 4 && name.length() >= 2){
                break;
            }else {
                System.out.println("用户名输入错误，请输入长度为2~4的用户名");
            }
//            if (name == null || name.length() > 4 || name.length() < 2){
//                throw new RuntimeException("用户名格式不正确");
//            }
        }

        System.out.println("请输入密码");
        while (true){
            try{
                int password = scanner.nextInt();
                if (password < 100000){
                    throw new RuntimeException("密码长度不正确");
                }
                break;
            }catch (Exception e){
                System.out.println("转换出错：" + e);
            }
        }

        System.out.println("请输入邮箱");
        while (true){
            try{
                String mail = scanner.next();
                int index = mail.indexOf('@');
                if ( index <= 0 || mail.indexOf('.') < index ){
                    throw new RuntimeException("邮箱不正确");
                }else {
                    break;
                }
            }catch (Exception e){
                System.out.println("邮箱不正确");
            }


        }


    }
}
