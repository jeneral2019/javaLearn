package base.exec;

import java.util.Scanner;

public class TryCatchExercise04 {
    public static void main(String[] args) {
        int num;
        String inputStr;
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("请输入一个整数");
                inputStr = scanner.next();
                num = Integer.parseInt(inputStr);
                break;
            }catch (Exception e){

            }
        }

    }
}