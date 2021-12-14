package project.smallchange;


import java.util.Scanner;

/**
 * 零钱通项目实战
 * 完成收益入账，消费，查看明细，退出系统等功能
 * @author yuxiangfeng
 */
public class SmallChangeSys {
    public static void main(String[] args) {
        SmallChange smallChange = new SmallChange();
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        menu.select(smallChange,scanner);

    }

}

class Menu {
    public void getMenu(){
        System.out.println("----------零钱通菜单----------");
        System.out.println("\t\t1 零钱通明细");
        System.out.println("\t\t2 收益入账");
        System.out.println("\t\t3 消费");
        System.out.println("\t\t4 退\t出");
        System.out.println("请选择(1-4)");
    }

    public void select(SmallChange smallChange,Scanner scanner){
        getMenu();
        int input = scanner.nextInt();
        switch (input){
            case 1:
                smallChange.getDetails();
                break;
            case 2:
                System.out.println("请输入收益入账金额");
                double price = scanner.nextDouble();
                smallChange.income(price);
                break;
            case 3:
                System.out.println("请输入消费对象");
                String name = scanner.next();
                System.out.println("请输入消费金额");
                double price2 = scanner.nextDouble();
                smallChange.consume(name,price2);
                break;
            case 4:
                return;
            default:
                System.out.println("输入错误了，请重新输入");
        }
        select(smallChange,scanner);
    }
}
